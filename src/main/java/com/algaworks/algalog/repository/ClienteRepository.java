package com.algaworks.algalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algalog.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining(String nome);
    Optional<Cliente> findByEmail(String email);
}
