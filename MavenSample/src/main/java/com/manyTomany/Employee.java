package com.manyTomany;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.*;

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String name;
	@ManyToMany
	@JoinTable
	(name="employee_Project",
	joinColumns = {@JoinColumn(name="eid")},
	inverseJoinColumns = {@JoinColumn(name="pid")}
	)
	
//	
	private List<Project> projects;
	
	
	//Getter and Setter
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	
	//constuctor
	
	public Employee(int eid, String name, List<Project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}
	
	//Generate Constructor using Super Class
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
