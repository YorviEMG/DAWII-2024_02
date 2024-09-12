package com.prestamo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.Pais;

@Service
public class PaisServiceImpl implements PaisService{

	@Autowired
	private PaisRepository paisRepository;

	@Override
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return paisRepository.findAll();
	}

}
