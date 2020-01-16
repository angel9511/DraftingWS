package co.edu.unal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.unal.model.CardLists;

@SpringBootApplication
//@EnableJpaRepositories("co.edu.unal.repository.**")
public class OperationApplication {

	public static void main(String[] args) {
		CardLists.initCardArrays();
		SpringApplication.run(OperationApplication.class, args);
	}

}
