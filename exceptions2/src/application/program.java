package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;



public class program {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date now = new Date();
		try{
			System.out.println("Enter resevation DATA:");
			System.out.print("Room number: ");
			int roomNum = sc.nextInt();
			System.out.print("Check-In date: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-Out date: ");
			Date checkOut = sdf.parse(sc.next());
			Reservation reserv = new Reservation(roomNum, checkIn, checkOut);
			System.out.println(reserv);
			System.out.println(" ");
			
			System.out.println("Update reservation dates:");
			System.out.print("New check-in date: ");
			checkIn = sdf.parse(sc.next());
			System.out.print("New check-out date: ");
			checkOut = sdf.parse(sc.next());
			reserv.updateDates(checkIn, checkOut);
			System.out.println(reserv);
		}
		catch(ParseException e) {
			System.out.println("Invalide date");
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
	}
}
