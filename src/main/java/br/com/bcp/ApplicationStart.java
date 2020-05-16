package br.com.bcp;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class ApplicationStart implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}
	
	@Autowired
	private PersonGateway gateway;
	
	@Override
	public void run(ApplicationArguments arg0) throws InterruptedException, ExecutionException {
		Person person = new Person(4,"Jane","Doe");
		System.out.println("#1 Send message to JMS: " + person);
		this.gateway.save(person);
	}
	

}
