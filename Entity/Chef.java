package com.exercice.Entity;

import javax.persistence.Entity;

@Entity
public class Chef extends AppUser{

	private String groupe;

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	
}
