package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	//UseCase: 1
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz!!";
    }
    
    //UseCase: 2
    @RequestMapping("/query")
    public String printHelloQuery(@RequestParam String name) {
    	return "Hello " + name+ "!";
    }
    
    //UseCase: 3
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
    	return "Hello " + name + "!";
    }
    
    //UseCase: 4
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
    	return "Hello " + user.getFirstName() + " " + user.getLastName()+ "!";
    }
    
    //UseCase: 5
    @PutMapping("/put/{firstName}")
    public String SayHellobyboth(@PathVariable String firstName, @RequestParam String lastName) {
    	return "Hello "+ firstName + " " + lastName + "!";
    }
    
    
}
