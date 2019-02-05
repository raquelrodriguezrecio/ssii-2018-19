package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Controlador principal.
 * Redirige las peticiones a diferentes vistas.
 */

@Controller
public class MainController {

    // Cadena a incrustar en la vista.
    private String msgBienvenida = "Hola Sistemas de Información";


    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.msgBienvenida);
        // Se debe devolver el nombre de la plantilla a la que se invoca !!
        return "home";
    }

}
