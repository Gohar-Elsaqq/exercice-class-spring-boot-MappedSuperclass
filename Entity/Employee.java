package com.exercice.Entity;

import javax.persistence.Entity;

@Entity
public class Employee extends User{

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
