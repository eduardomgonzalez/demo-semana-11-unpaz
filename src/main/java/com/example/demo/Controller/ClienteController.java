package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Cliente;
import com.example.demo.Service.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    @PostMapping("/cliente")
    public Cliente guardar(@RequestBody Cliente entidad) {
        return clienteService.guardar(entidad);
    }

    @PutMapping("/cliente")
    public Cliente actualizar(@RequestBody Cliente entidad) {
        return clienteService.actualizar(entidad);
    }

    @DeleteMapping("/cliente")
    public void eliminar(@RequestBody Cliente entidad) {
        clienteService.eliminar(entidad);
    }
}
