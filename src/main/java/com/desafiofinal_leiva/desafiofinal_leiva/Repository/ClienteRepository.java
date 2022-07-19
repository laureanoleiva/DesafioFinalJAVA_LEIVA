package com.desafiofinal_leiva.desafiofinal_leiva.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiofinal_leiva.desafiofinal_leiva.Entidad.Cliente

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}

