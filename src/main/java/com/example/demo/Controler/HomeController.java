package com.example.demo.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /*
    Atiende solicitudes que vengan de /
     */
    @GetMapping("/")
    public String home() {
        return "Hola Bienvenido, estás en el HOME!";
    }

}
