package ap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ap.entities.EmployeesEO;

public interface EmployeesRepository extends CrudRepository<ap.entities.EmployeesEO, String>{

	@Query("SELECT e FROM EmployeesEO e WHERE e.employee_id = :employeeId AND e.password = :password")
	Optional<EmployeesEO> findByEmployeeIdAndPassword(@Param("employeeId") String employeeId, @Param("password") String password);

}
