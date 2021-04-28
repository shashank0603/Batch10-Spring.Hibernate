package com.te.hibernate.movie;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
public class Movie implements Serializable{
	@Id
	@Column
	private int id;
	@Column
	private String name;
	
	public Movie() {
		
	}

	@Autowired(required = false)
	
	private Actor actor;
}
