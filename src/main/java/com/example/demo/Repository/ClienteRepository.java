package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Cliente;

/*
    Conecta JPA y HIBERNATE
 */

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNombre(String nombre); // busqueda exacta
    List<Cliente> findByNombreIgnoreCase(String nombre); // busqueda sin importar mayusculas y minusculas
    List<Cliente> findByNombreAndApellido(String nombre, String apellido);
    
    // Consulta personalizada con JPQL sobre la entidad Cliente.
    @Query("SELECT c FROM Cliente c WHERE c.email = :email")
    Optional<Cliente> buscarClientePorEmail(@Param("email") String email);

}
