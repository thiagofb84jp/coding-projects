package com.agenda.agenda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

	@Autowired
	private AgendaService agendaService;
	
	
	@GetMapping
	public List<Person> getPeople(){
		return agendaService.getAllPeople();
	}
	
	@GetMapping("/{id}")
	public Person getPerson(@PathVariable("id") Long id){
		return agendaService.getPersonById(id);
	}	
}