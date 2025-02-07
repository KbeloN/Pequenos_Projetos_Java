package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		if(checkIn.before(this.checkIn) || checkOut.before(this.checkOut)){
			return "The reservation date must be future.";	
		}
		if(!checkOut.after(checkIn)) {
			return "Check-out date must be after check-in date.";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation | Room number : ");
		sb.append(roomNumber);
		sb.append(", check-In: ");
		sb.append(sdf.format(checkIn) );
		sb.append(", check-Out: ");
		sb.append(sdf.format(checkOut));
		sb.append(", ");
		sb.append(duration());
		sb.append(" nights.");
		return sb.toString();
	}
}
