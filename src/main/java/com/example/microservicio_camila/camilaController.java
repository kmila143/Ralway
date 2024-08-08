package com.example.microservicio_camila;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class camilaController {

    @GetMapping("/nombre")
    public String enviarNombre() {
        return "Camila";
    }
}
