package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	//UseCase: 1
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz!!";
    }
    
    //UseCase: 2
    @GetMapping("/query")
    public String printHelloQuery(@RequestParam String name) {
    	return "Hello " + name+ "!";
    }
    
    //UseCase: 3
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
    	return "Hello " + name + "!";
    }
    
    
    
    
}
