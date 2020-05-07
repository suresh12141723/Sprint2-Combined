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
@Table(name="lpu_movie_Ticket")
public class Ticket {
@Id
@Column(name="ticket_id")
private int ticketId;
@Column(name="noofseats")
private int noOfSeats;
@Column(name="seatName")
private String seatName;
@Column(name="Screenname")
private String screenname;
@ManyToOne
@JoinColumn(name="booking_id")
private Booking bu;
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String getSeatName() {
	return seatName;
}
public void setSeatName(String seatName) {
	this.seatName = seatName;
}
public String getScreenname() {
	return screenname;
}
public void setScreenname(String screenname) {
	this.screenname = screenname;
}
public Booking getBu() {
	return bu;
}
public void setBu(Booking bu) {
	this.bu = bu;
}

}
