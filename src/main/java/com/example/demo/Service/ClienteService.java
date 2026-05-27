package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Cliente;

public interface ClienteService {
    List<Cliente> listar();
    Cliente guardar(Cliente entidad);
    Cliente actualizar(Cliente entidad);
    void eliminar(Cliente entidad);

    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByNombreIgnoreCase(String nombre);
    List<Cliente> findByNombreAndApellido(String nombre, String apellido);
    Optional<Cliente> buscarClientePorEmail(String email);
}
