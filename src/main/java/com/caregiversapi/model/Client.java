package com.caregiversapi.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="old_client")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(
		name="carer_client",
		joinColumns=@JoinColumn(name="id_client"),
		inverseJoinColumns=@JoinColumn(name="id_caregiver")
	)
	private Set<Caregiver> caregivers;
	
	public void addCaregiver(Caregiver caregiver) {
		if(this.caregivers == null) {
			this.caregivers = new HashSet<>();
		}
		
		this.caregivers.add(caregiver);
	}
	
	public void deleteCaregiver(Caregiver caregiver) {
		this.caregivers.remove(caregiver);
	}
}
