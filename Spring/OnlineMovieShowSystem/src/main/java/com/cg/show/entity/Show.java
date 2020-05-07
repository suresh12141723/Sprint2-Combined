package com.cg.show.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="lpu_movie_show")
public class Show {
	@Id
	@Column(name="show_id")
	private int showId;
	@Column(name="show_name", length=25)
	private String showName;
	@Column(name="seats")
	private int seats;
	@Column(name="screen_name", length=25)
	private String screenName;
	@Column(name="show_start_time")
	private LocalTime showstartTime;
	@Column(name="show_end_time")
	private LocalTime showendTime;
	
	
	// @ManyToOne
	 
	// @JoinColumn(name="movie_id", referencedColumnName="movie_id") 
	// private Movie movie;
	
	@ManyToOne
	@JoinColumn(name="theaterId", referencedColumnName = "theaterId")
	private Theater theater;

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public LocalTime getShowstartTime() {
		return showstartTime;
	}

	public void setShowstartTime(LocalTime showstartTime) {
		this.showstartTime = showstartTime;
	}

	public LocalTime getShowendTime() {
		return showendTime;
	}

	public void setShowendTime(LocalTime showendTime) {
		this.showendTime = showendTime;
		
	}

	public Show(int showId, String showName, int seats, String screenName,LocalTime showstartTime,LocalTime showendTime) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.seats = seats;
		this.screenName = screenName;
		this.showstartTime = showstartTime;
		this.showendTime = showendTime;
		//this.theater=theater;
	}
	public Show() {
		
	}

}