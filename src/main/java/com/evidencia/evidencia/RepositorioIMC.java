package com.evidencia.evidencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioIMC extends JpaRepository<RegistroIMC, Long> {

    void saveAll(RegistroIMC registroIMC);
}