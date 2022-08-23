package com.Springboot.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UniversityApp {
	@Id
	private int id;
	private String name;
	private String totalClg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTotalClg() {
		return totalClg;
	}
	public void setTotalClg(String totalClg) {
		this.totalClg = totalClg;
	}
}
