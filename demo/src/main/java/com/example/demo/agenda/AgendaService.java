package com.example.demo.agenda;

import java.util.List;

public interface AgendaService {
	
	Person getPersonById(Long id);
	
	List<Person> getAllPeople();
}