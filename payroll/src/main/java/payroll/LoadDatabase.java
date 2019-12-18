package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase{
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
		return args -> {
			employeeRepository.save(new Employee("João da Silva", "Developer"));
			employeeRepository.save(new Employee("Maria Lima da Silva", "Developer"));
			
			log.info("The sample data has been generated.");
			log.info("My first Spring Boot project.");
		};
	}
}