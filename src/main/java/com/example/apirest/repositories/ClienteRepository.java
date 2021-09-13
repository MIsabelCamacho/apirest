package com.example.apirest.repositories;

import com.example.apirest.modelos.ClienteModelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModelo, Integer>
{
    
}
