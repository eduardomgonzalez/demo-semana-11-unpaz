package com.example.demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Cliente;
import com.example.demo.Service.ClienteService;

@RestController
public class ClienteController {

    // Los metodos siempre van a ser publicos
    // Le dice a Spring que lo busque.
    // El atributo conecta el Controller con el Service
    @Autowired 
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    // RequestBody: Transforma lo que recibo en parametro y lo transforma en Cliente.
    @PostMapping("/cliente")
    public Cliente guardar(@RequestBody Cliente entidad) {
        return clienteService.guardar(entidad);
    }

    
    
}
