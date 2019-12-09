package com.example.demo.employee;

import static com.example.demo.employee.Employee.genSalary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.agenda.Address;
import com.example.demo.agenda.AgendaRepository;
import com.example.demo.agenda.Contact;
import com.example.demo.agenda.Person;
import com.github.javafaker.Faker;

@SpringBootApplication
@ComponentScan("{com.example.demo}")
@EntityScan("com.example.demo")
@EnableJpaRepositories("com.example.demo")
public class DemoApplication extends SpringBootServletInitializer{

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner setupAgenda(AgendaRepository agendaRepository) {
		Contact contact = new Contact("1835670688", "18992761263", "compras@elzaesaratelecomme.com.br");
		
		Address address = new Address("Rua João Cório", 885L, "Guanabara", "Próximo ao supermercados Compre Mais", "Araçatuba", "SP", "85749632");
		
		return (args) -> {
			agendaRepository.save(new Person(new Faker().name().fullName(), address, contact));

			logger.info("The sample data has been generated.");
		};
	}*/
	
	@Bean
	public CommandLineRunner setupEmployee(EmployeeRepository employeeRepository) {
		return (args) -> {
			for (int i = 0; i < 10; i++) {
				employeeRepository.save(
						new Employee(new Faker().name().firstName(), new Faker().name().lastName(), true, genSalary()));
			}

			logger.info("The sample data has been generated.");
		};
	}
}