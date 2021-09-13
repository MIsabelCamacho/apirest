package com.example.apirest.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.apirest.modelos.ClienteModelo;
import com.example.apirest.servicios.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController 
{
    @Autowired
    private ClienteService clienteService;

    @GetMapping("api/cliente")
    
    //metodo para guardar
    @PostMapping("api/clientes")
    public ClienteModelo guardarCliente(@RequestBody ClienteModelo cliente)
    {
        System.out.println(cliente);
        clienteService.guardar(cliente);
        return cliente;
    }
    //metodo listar todo
    @GetMapping("api/clientes")
    public List<ClienteModelo> listar()
    {
        return clienteService.obtenerDatos();
    }
    //metodo listar por codigo
    @GetMapping("api/clientes/{codigo}")
    public Optional<ClienteModelo> listaCliente(@PathVariable("codigo") Integer codigo)
    {
        return clienteService.obtenerCliente(codigo);
    }

    @PutMapping("api/clientes")
    public void modificarCliente(@RequestBody ClienteModelo cliente)
    {
        clienteService.modificar(cliente);
    }

    @DeleteMapping("api/clientes/{codigo}")
    public void eliminarCliente(@PathVariable("codigo") Integer codigo)
    {
        clienteService.eliminar(codigo);
    }

}
