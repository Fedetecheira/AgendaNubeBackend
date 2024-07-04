package com.example.agendanube.repository;

import com.example.agendanube.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Persona, Long> {
}
