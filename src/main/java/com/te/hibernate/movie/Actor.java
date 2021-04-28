package com.te.hibernate.movie;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Actor implements Serializable {

	@Id
	@Column
	private int act_id;
	@Column
	private String act_name;
}
