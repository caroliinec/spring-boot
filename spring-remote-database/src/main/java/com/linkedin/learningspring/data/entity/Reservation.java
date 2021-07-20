package com.linkedin.learningspring.data.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation {
	
	@Id
	@SequenceGenerator(name = "RESERVATION_GENERATOR", sequenceName = "SQ_RESERVATION_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESERVATION_GENERATOR")
	@Column(name="RESERVATION_ID")
	private long reservationId;
	
	@Column(name = "ROOM_ID")
	private long roomId;
	
	@Column(name = "GUEST_ID")
	private long guestId;
	
	@Column(name = "RES_DATE")
	private Date reservationDate;

	public long getReservationId() {
		return reservationId;
	}

	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public long getGuestId() {
		return guestId;
	}

	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

}
