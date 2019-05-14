package com.wahid.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wahid.service.DemoService;

@SpringBootApplication(scanBasePackages = "com.wahid")
@RestController
public class SciCalcApplication {
 
	@Autowired
    private DemoService demoService;
 
    // constructor
 
    @GetMapping("/add")
    public Integer isEvenOrOdd() {
        return demoService.add(2, 3);
    }
 
    public static void main(String[] args) {
        SpringApplication.run(SciCalcApplication.class, args);
    }
}