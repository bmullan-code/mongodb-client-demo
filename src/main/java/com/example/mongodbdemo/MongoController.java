package com.example.mongodbdemo;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class MongoController {
		
		@Autowired
		private CustomerRepository repository;


	    @RequestMapping("/")
	    public String helloWorld(){
	    	repository.save(new Customer("joe", "bloggs"));
	    	return "Hello world";
	    }
	}