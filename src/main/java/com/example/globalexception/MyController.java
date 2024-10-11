package com.example.globalexception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {

    @GetMapping("/resource/{id}")
    public String getString(@PathVariable("id") String id){
        if (id.equals("0")){
            throw new ResourceNotFoundException("Not Found this Id");
        }
        return id;
    }
}
