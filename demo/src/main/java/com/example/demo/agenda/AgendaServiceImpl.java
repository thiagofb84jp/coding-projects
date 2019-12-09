package com.example.demo.agenda;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.NotFoundException;

@Service("agendaService")
@Transactional
public class AgendaServiceImpl implements AgendaService{

	@Autowired
	AgendaRepository agendaRepository;
		
	
	@Override
	public Person getPersonById(Long id) {
		Optional<Person> agendaOpt = agendaRepository.findById(id);
		
		if (agendaOpt.isPresent()) {
			return agendaOpt.get();
		}
		
		throw new NotFoundException("Person not found. Please, verify if this contact is right.");
	}

	@Override
	public List<Person> getAllPeople() {
		return agendaRepository.findAll();
	}
}
