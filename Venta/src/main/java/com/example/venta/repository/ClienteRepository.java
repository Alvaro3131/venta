package com.example.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.venta.entity.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
