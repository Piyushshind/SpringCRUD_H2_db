package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crudController {
	@Autowired
	public  MyRepo myRepo ;
	
	@GetMapping("/test1")
	public String myString2() {
		System.out.println(" from  myString2() method ");
		return "Hello from Test  ";
	
	}
	
	
	@PostMapping("/insert1")
	public String InsertData( @RequestBody crudEntity crudentity) {
		myRepo.save(crudentity);
		return "Data inserted succesfully";
	}
	
	@GetMapping("/showAll")
	public List<crudEntity> showAll(){
		return myRepo.findAll();
	}
}
