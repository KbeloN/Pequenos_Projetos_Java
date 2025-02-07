package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;



public class program {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date now = new Date();
		
		try {
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
				
				
				if(checkIn.before(now) || checkOut.before(now)){
					System.out.println("Error in update: the reservation date must be future");	
				}
				else if(!checkOut.after(checkIn)) {
					System.out.println("Error in update: check-out date must be after check-in date.");
				}
				else {
					reserv.updateDates(checkIn, checkOut);
					System.out.println(reserv);
				}
			}
		}
		catch(ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally{
			sc.close();
		}
	}
}
