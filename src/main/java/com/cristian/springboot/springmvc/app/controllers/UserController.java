package com.cristian.springboot.springmvc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cristian.springboot.springmvc.app.entities.User;

@Controller
@RequestMapping("/app")
public class UserController {

    @GetMapping("view")
    public String obtenerDatosVista(Model modelo) {
    	modelo.addAttribute("titulo", "Hola Spring Boot MVC");
    	modelo.addAttribute("mensaje", "Esto es un mensaje desde el controlador");
    	modelo.addAttribute("user", new User("Andres","Guzman"));
        return "viewModel";
    }
}
