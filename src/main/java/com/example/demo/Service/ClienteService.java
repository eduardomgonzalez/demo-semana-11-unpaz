package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Cliente;

public interface ClienteService {
    List<Cliente> listar();
    Cliente guardar(Cliente entidad);
    Cliente actualizar(Cliente entidad);
    void eliminar(Cliente entidad);
}
