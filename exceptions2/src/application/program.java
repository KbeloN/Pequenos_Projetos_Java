package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;



public class program {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date now = new Date();
		
		System.out.println("Enter resevation DATA:");
		System.out.print("Room number: ");
		int roomNum = sc.nextInt();
		System.out.print("Check-In date: ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-Out date: ");
		Date checkOut = sdf.parse(sc.next());
		if(checkIn.before(now) || checkOut.before(now)){
			System.out.println("Error in reservation: the reservation date must be future");	
		}
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: check-out date must be after check-in date.");
		}else {
			Reservation reserv = new Reservation(roomNum, checkIn, checkOut);
			System.out.println(reserv);
			System.out.println(" ");
			
			System.out.println("Update reservation dates:");
			System.out.print("New check-in date: ");
			checkIn = sdf.parse(sc.next());
			System.out.print("New check-out date: ");
			checkOut = sdf.parse(sc.next());
			
			String error = reserv.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			}else {	
				reserv.updateDates(checkIn, checkOut);
				System.out.println(reserv);
			}
		}
	}
}
