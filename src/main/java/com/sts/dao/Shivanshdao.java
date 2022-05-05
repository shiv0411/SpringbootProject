package com.sts.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.sts.Student.Shivansh;


public class Shivanshdao {
	
	@Autowired
	private Shivansh shivansh;

	public Shivansh getShivansh() {
		return shivansh;
	}

	public void setShivansh(Shivansh shivansh) {
		this.shivansh = shivansh;
	}

	public Shivanshdao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shivanshdao(Shivansh shivansh) {
		super();
		this.shivansh = shivansh;
	}

	@Override
	public String toString() {
		return "Shivanshdao [shivansh=" + shivansh + "]";
	}
	
	

}
