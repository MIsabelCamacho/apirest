package com.example.apirest.modelos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cliente")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClienteModelo 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer codigo;
    private String nombre;
    private String apellido;
    private String ci;
    private Integer celular;
    private String direccion; 

    public ClienteModelo(){
    }
    
    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }
    public Integer getCodigo(){
        return codigo;
    }

    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getCi()
    {
        return ci;
    }
    public void setCi(String ci){
        this.ci = ci;
    }

    public void setCelular(Integer celular){
        this.celular = celular;
    }
    public Integer getCelular(){
        return celular;
    }

    public String getDireccion()
    {
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}
