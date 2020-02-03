package gh.hylx.frs;

import java.util.ArrayList;

public class Flight {
	int id;
	String origin;
	String destination;
	
	int c_size = 10; // confirmation list size
	int w_size = 10; // waiting list size
	ArrayList<Integer> c_list = new ArrayList<>(c_size);  // confirmation list
	ArrayList<Integer> w_queue = new ArrayList<>(w_size); // waiting list
	
}
