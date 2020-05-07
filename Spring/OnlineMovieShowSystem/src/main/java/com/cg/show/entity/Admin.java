package com.cg.show.entity;
import java.time.LocalDate;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@Table(name="lpu_movie_Admin")

public class Admin {
	@Id
	@Column(name="user_id")
	private int userId;
	@Column(name="admin_name")
	private String adminName;
	@Column(name="password")
	private String password;
	@Column(name="admin_Contact")
	private String adminContact;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private user u = new user();
	
	

}
