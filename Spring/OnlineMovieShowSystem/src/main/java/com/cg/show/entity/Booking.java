package com.cg.show.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="lpu_movie_booking")
public class Booking {
	@Id
	@Column(name="booking_id")
	private int bookingid;
	@Column(name="no_of_seats")
	private int noOfSeats;
	@Column(name="booking_date")
	private LocalDate bookingDate;
	@Column(name="total_cost")
	private double totalCost;
	@Column(name="user_name")
	private String userName;
	@Column(name="contact")
	private String contact;
	@ManyToOne
	@JoinColumn(name="seat_Id", referencedColumnName = "seat_id")
	private Seat seat;
	

}
