package ap.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomOrderIdGenerator implements IdentifierGenerator {

    private static final String SELECT_MAX_ORDER_ID = "SELECT MAX(order_id) FROM order_details";

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        Connection connection = session.connection();
        try {
            int nextOrderId = getNextOrderId(connection);
            return "ORD" + String.format("%03d", nextOrderId);
        } catch (SQLException e) {
            throw new HibernateException("Error generating order ID", e);
        }
    }

    private int getNextOrderId(Connection connection) throws SQLException {
        int nextOrderId;
        try (PreparedStatement stmt = connection.prepareStatement(SELECT_MAX_ORDER_ID);
             ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                String orderIdStr = resultSet.getString(1);
                if (orderIdStr!= null) {
                    // Extract the numeric part from the order ID string
                    String numericPart = orderIdStr.substring(3); // Remove the "ORD" prefix
                    int currentOrderId = Integer.parseInt(numericPart);
                    nextOrderId = currentOrderId + 1;
                } else {
                    nextOrderId = 1;
                }
            } else {
                nextOrderId = 1;
            }
        }
        return nextOrderId;
    }
}