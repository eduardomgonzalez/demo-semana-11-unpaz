package com.example.demo.Model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
    Le digo que va a ser una entidad y se va a mapear con una tabla.
    Table: Especifica con que tabla se mapea.
 */
@Entity
@Table(name = "Cliente")
public class Cliente {

    /*
        GeneratedValue: Incrementa el Id.
        Column: Darle el nombre a la columna de la tabla.
        JsonProperty: Va a representar como quiero que se llame el atributo cuando devuelvo la información.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    @JsonProperty("idCliente")
    private Long idCliente;

    private String nombre;
    private String apellido;
    private String email;
    private LocalDateTime fechaRegistro;
    private String password;
    private String direccion;

    public Cliente(){} // Importante, siempre tiene que estar.
    /* Spring necesita tener algo que instanciar, si no pongo da error. */

    public Cliente(Long idCliente, String nombre, String apellido, String email, LocalDateTime fechaRegistro,
            String password, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.password = password;
        this.direccion = direccion;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

}
