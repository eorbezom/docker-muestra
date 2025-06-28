package com.microservico2.microservico2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/servicio2")
public class Microservici2Controller {
	@GetMapping("/hello")
    public String hello() {
        return "Hola desde microservicio 2";
    }

}
