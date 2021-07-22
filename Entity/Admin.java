package com.exercice.Entity;

import javax.persistence.Entity;

import com.sun.istack.NotNull;
@Entity
public class Admin extends AppUser{

	@NotNull
	private String departement;

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
}
