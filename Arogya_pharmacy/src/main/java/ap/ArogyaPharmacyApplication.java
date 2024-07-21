package ap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ap")

public class ArogyaPharmacyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArogyaPharmacyApplication.class, args);
	}

}
