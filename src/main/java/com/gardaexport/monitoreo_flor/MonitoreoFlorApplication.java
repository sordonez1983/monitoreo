package com.gardaexport.monitoreo_flor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MonitoreoFlorApplication {

    @GetMapping("/hello")
    public String hello(){
        return "Hola Mundo Spring Vamos Ahi";
    }
    
    public static void main(String[] args) {
		SpringApplication.run(MonitoreoFlorApplication.class, args);
	}

}
