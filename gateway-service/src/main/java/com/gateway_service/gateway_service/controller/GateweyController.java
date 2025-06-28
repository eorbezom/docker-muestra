package com.gateway_service.gateway_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 */
@RestController
public class GateweyController {
	@GetMapping("/hello")
	public String hello() {
		return "hola desde gatewey";
	}


}


/**
 * 
 * 
 * Servicio	                    URL	                                Respuesta esperada
 * 
 * Gateway	        http://localhost:8080/hello	..........................."hola desde gatewey"
 * Microservicio 1	http://localhost:8081/servicio1/hello ..............	"Hola desde microservicio 1"
 * Microservicio 2	http://localhost:8082/servicio2/hello ..............	"Hola desde microservicio 2"
 * Gateway → M1 	http://localhost:8080/microservico1/servicio1/hello ....	"Hola desde microservicio 1"
 * Gateway → M2	    http://localhost:8080/microservico2/servicio2/hello	........"Hola desde microservicio 2"
 * 
 * 
 * 
 * 
 * 
 * 
 */