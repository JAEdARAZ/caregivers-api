package com.caregiversapi.controller;

import java.util.List;

import com.caregiversapi.model.Caregiver;

public interface ICaregiversController {
	List<Caregiver> getAll();
}
