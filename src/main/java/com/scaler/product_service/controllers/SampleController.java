package com.scaler.product_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SampleController {

    @GetMapping("/hi/{name}/{name2}")
    public String sayHello(@PathVariable("name") String name,@PathVariable("name2") String name2){
        return "Hello " + name + name2;
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "bye";
    }
}
