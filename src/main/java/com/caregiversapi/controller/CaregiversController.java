package com.caregiversapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caregiversapi.model.Caregiver;
import com.caregiversapi.service.ICaregiversService;

@RestController
@RequestMapping("caregivers")
public class CaregiversController implements ICaregiversController{
	@Autowired
	private ICaregiversService caregiversService;
	
	@GetMapping("")
	@Override
	public List<Caregiver> getAll(){
		return caregiversService.findAll();
	}
}
