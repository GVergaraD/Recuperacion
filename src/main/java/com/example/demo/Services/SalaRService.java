package com.example.demo.Services;


import com.example.demo.Models.SalaR;
import com.example.demo.Repository.SalaRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("ServicioSalaR")
public class SalaRService {

	@Autowired
	@Qualifier("RepositorySalaR")
	private SalaRRepository salarRepository;


	//request
	public List<SalaR> listAll() {
		return (salarRepository.findAll());
	}
	public Optional<SalaR> listOne(Long id) {
		return (salarRepository.findById(id));
	}
	public List<SalaR> listByDisponibilidad(Integer disponibilidad) {
		return (salarRepository.findByDisponibilidad(disponibilidad));
	}

	//create & update
	public SalaR saveOrUpdateSalaR(SalaR salar) {
		return salarRepository.save(salar);
	}

	//delete 1 sala por id
	@Transactional
	public void deleteSalaR(Long id) {
		salarRepository.deleteById(id);
	}
}
