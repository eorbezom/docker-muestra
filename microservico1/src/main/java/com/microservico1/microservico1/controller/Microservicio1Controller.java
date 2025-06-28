package com.microservico1.microservico1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicio1")
public class Microservicio1Controller {
	@GetMapping("/hello")
    public String hello() {
        return "Hola desde microservicio 1";
    }


}
