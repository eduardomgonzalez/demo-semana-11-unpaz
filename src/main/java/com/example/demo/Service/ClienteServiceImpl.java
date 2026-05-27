package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Cliente;
import com.example.demo.Repository.ClienteRepository;

/*
    Service: Le indica que la clase es un servicio.
*/
@Service // Importante.
public class ClienteServiceImpl implements ClienteService {
    
    // Le comunica a Spring para que lo conozca.
    @Autowired
    private ClienteRepository clienteRepository;

    /*
        findAll, save, delete son metodos de JPA
     */

    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente guardar(Cliente entidad) {
        return clienteRepository.save(entidad);
    }

    @Override
    public Cliente actualizar(Cliente entidad) {
        return clienteRepository.save(entidad);
    }

    @Override
    public void eliminar(Cliente entidad) {
        clienteRepository.delete(entidad);
    }

    @Override
    public Optional<Cliente> buscarClientePorEmail(String email) {
        return clienteRepository.buscarClientePorEmail(email);
    }

    @Override
    public List<Cliente> findByNombre(String nombre) {
        return clienteRepository.findByNombre(nombre);
    }

    @Override
    public List<Cliente> findByNombreAndApellido(String nombre, String apellido) {
        return clienteRepository.findByNombreAndApellido(nombre, apellido);
    }

    @Override
    public List<Cliente> findByNombreIgnoreCase(String nombre) {
        return clienteRepository.findByNombreIgnoreCase(nombre);
    }

}
