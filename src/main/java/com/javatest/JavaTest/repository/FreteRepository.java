package com.javatest.JavaTest.repository;

import com.javatest.JavaTest.model.Frete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreteRepository extends JpaRepository<Frete, Long> {
    Frete findByName(String nomeDestinatario);
}
