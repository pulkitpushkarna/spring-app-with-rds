package com.ebs.demo.ebsdemo;

import com.ebs.demo.ebsdemo.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EbsDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(EbsDemoApplication.class, args);
		EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);
		System.out.println(employeeRepository.findAll());
	}

}
