package com.example.demo.agenda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("agendaRepository")
public interface AgendaRepository extends JpaRepository<Person, Long> {
	
}