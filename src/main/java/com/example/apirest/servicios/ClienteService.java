package com.example.apirest.servicios;

import java.util.List;
import java.util.Optional;

import com.example.apirest.modelos.ClienteModelo;
import com.example.apirest.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService 
{
    @Autowired
    private ClienteRepository clienteRepository;

    public void guardar(ClienteModelo cliente)
    {
        clienteRepository.save(cliente);
    }

    public List<ClienteModelo> obtenerDatos()
    {
        return clienteRepository.findAll();
    }

    public Optional<ClienteModelo> obtenerCliente(Integer codi)
    {
        return clienteRepository.findById(codi);
    }

    public void modificar (ClienteModelo cliente)
    {
        clienteRepository.save(cliente);
    }

    public void eliminar (Integer codigo)
    {
        clienteRepository.deleteById(codigo);
    }
}
