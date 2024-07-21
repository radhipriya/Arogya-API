package ap.util;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;
 
import java.io.Serializable;
import java.util.UUID;
 
@Component
public class CustomStringIdGenerator implements IdentifierGenerator {
 
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        return "U" + UUID.randomUUID().toString().replace("-", "").substring(0, 7).toUpperCase();
    }
}