package com.azuresq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSqlApplication {
//demos
//First@1234
	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping("/add")
	public Employee add(@RequestBody Employee emp){
		return employeeRepository.save(emp);
	}

	@GetMapping("/show")
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureSqlApplication.class, args);
	}

}
