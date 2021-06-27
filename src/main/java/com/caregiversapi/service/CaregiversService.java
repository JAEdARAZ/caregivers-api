package com.caregiversapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caregiversapi.model.Caregiver;
import com.caregiversapi.repository.ICaregiversRepository;

@Service
public class CaregiversService implements ICaregiversService{
	private ICaregiversRepository caregiversRepository;
	
	@Autowired
	public CaregiversService (ICaregiversRepository caregiversRepository) {
		this.caregiversRepository = caregiversRepository;
	}
	
	@Override
	public List<Caregiver> findAll(){
		return caregiversRepository.findAll();
	}
}
