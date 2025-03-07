package com.luciaamalia.solid.repository;

import com.luciaamalia.solid.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository implements JpaRepository<Cliente, String> {
}
