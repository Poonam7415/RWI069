package com.manyTomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.*;

@Entity
public class Project {
	 
	  
	@Id
	private int pid;
	
	@Column(name="project_name")
	private String projectname;

	@ManyToMany(mappedBy = "projects")
	private  List <Employee> emps;
	
	//Setter and Getter

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	//constructor

	public Project(int pid, String projectname, List<Employee> emps) {
		super();
		this.pid = pid;
		this.projectname = projectname;
		this.emps = emps;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
