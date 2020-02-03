package gh.hylx.frs;

import java.util.ArrayList;

public class FlightReservationSystem {
	
	static void bookFlight(Passenger p, Flight f) {
		if (f.c_list.contains(p.id)){
			System.out.println("You already have a reservation for the flight. ");
		}else {
			if(f.c_list.size() <10 ) {
				f.c_list.add(p.id);
				System.out.println("Added to reservation list. ");
			}else {
				if(f.w_queue.contains(p.id)) {
					System.out.println("You already in the waiting queue. ");
				}else{ 
					if(f.w_queue.size() <10){
						f.w_queue.add(p.id);
						System.out.println("Confirmation list is full now, added to waiting queue. ");
					}else {
						System.out.println("Both confirmation list and waiting queue are full now, please tray again later. ");
					}
				}
			}
		}
	}

	static void cancelFlight(Passenger p, Flight f) {
		if(f.c_list.contains(p.id)) {
			f.c_list.remove(f.c_list.indexOf(p.id));
			f.c_list.add(f.w_queue.get(0));
			f.w_queue.remove(0);
			System.out.println("Reservation cancelled. ");
		}else {
			if(f.w_queue.contains(p.id)) {
				f.w_queue.remove(f.w_queue.indexOf(p.id));
				System.out.println("Removed from waiting queue. ");
			}else {
				System.out.println("You don't have flight yet. ");
			}
		}
	}
	
	public static void main(String[] args) {
		Flight ff = new Flight();
		ff.id = 99;
		System.out.println("A new confirmation list for ff: " + ff.c_list);
		System.out.println("A new waiting queue for ff: " + ff.w_queue);

		for(int i = 10; i <19; i++) {
			ff.c_list.add(i);
		}
		for(int i = 20; i <29; i++) {
			ff.w_queue.add(i);
		}
		System.out.println("Now confirmation list has 9 elements: \n" + ff.c_list);
		System.out.println("Confirmation list size: " + ff.c_list.size());
		System.out.println("Now waiting queue has 9 elements: \n" + ff.w_queue);
		System.out.println("Waiting queue size: " + ff.w_queue.size());
		
		Passenger pp1 = new Passenger();
		pp1.id = 12;
		Passenger pp2 = new Passenger();
		pp2.id = 19;		
		Passenger pp3 = new Passenger();
		pp3.id = 29;	
		Passenger pp4 = new Passenger();
		pp4.id = 29;			
		Passenger pp5 = new Passenger();
		pp5.id = 35;	

		bookFlight(pp1, ff);
		bookFlight(pp2, ff);
		bookFlight(pp3, ff);		
		bookFlight(pp4, ff);
		bookFlight(pp5, ff);
		System.out.println(ff.c_list.get(0));
		cancelFlight(pp2, ff);
		System.out.println("Confirmation list size: " + ff.c_list.size());
		System.out.println("Waiting queue size: " + ff.w_queue.size());
		cancelFlight(pp3, ff);
		cancelFlight(pp5, ff);
	}
}





















