package com.caregiversapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caregiversapi.model.Caregiver;

public interface ICaregiversRepository extends JpaRepository<Caregiver, Integer> {
}
