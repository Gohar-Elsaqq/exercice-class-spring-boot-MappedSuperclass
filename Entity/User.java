package com.exercice.Entity;

import javax.persistence.DiscriminatorColumn;

import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.sun.istack.NotNull;


@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "grade")
//@DiscriminatorColumn(name = "grade",discriminatorType=DiscriminatorType.STRING)
@TableGenerator(name = "Vehicle_GEN",table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VALUE", allocationSize = 1)
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String name;
	@NotNull
	private String firstname;
	/*
	 * @NotNull private String grade;
	 */
	@NotNull
	private int salary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/*
	 * public String getGrade() { return grade; }
	 * 
	 * public void setGrade(String grade) { this.grade = grade;
	 * 
	 * }
	 */

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", firstname=" + firstname + ", salary="
				+ salary + "]";
	}
	
	
	
}
