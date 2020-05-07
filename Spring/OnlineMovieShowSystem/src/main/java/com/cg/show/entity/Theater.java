package com.cg.show.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="lpu_movie_theater")
public class Theater{
	@Id
	@Column(name="theaterId")
	private int theaterId;
	@Column(name="theaterName")
	private String theaterName;
	@Column(name="theaterCity")
	private String theaterCity;
	@Column(name ="managerName")
	private String managerName;
	@Column(name ="managerContact")
	private int managerContact;
	@ManyToOne
	@JoinColumn(name="movieId", referencedColumnName = "movie_Id")
	private Movie movie;
	
	
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(int managerContact) {
		this.managerContact = managerContact;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	
	
	
}
