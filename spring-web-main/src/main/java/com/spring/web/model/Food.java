package com.spring.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food 
{
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sno;
	private String Starters;
	private String maindish;
	private String desserts;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String starters, String maindish, String desserts) {
		super();
		Starters = starters;
		this.maindish = maindish;
		this.desserts = desserts;
	}
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getStarters() {
		return Starters;
	}
	public void setStarters(String starters) {
		Starters = starters;
	}
	public String getMaindish() {
		return maindish;
	}
	public void setMaindish(String maindish) {
		this.maindish = maindish;
	}
	public String getDesserts() {
		return desserts;
	}
	public void setDesserts(String desserts) {
		this.desserts = desserts;
	}
	
}
