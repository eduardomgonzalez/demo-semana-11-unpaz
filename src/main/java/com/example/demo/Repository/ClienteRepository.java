package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Cliente;

/*
    Conecta JPA y HIBERNATE
 */

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
