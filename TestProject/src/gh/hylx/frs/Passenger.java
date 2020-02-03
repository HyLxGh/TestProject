package gh.hylx.frs;

public class Passenger {
	int id;
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	Passenger(){
		
	}
	
	Passenger(int id){
		this.id = id;
	}
	
	Passenger(int id, String name){
		this.id = id;
		this.name = name;
	}
	
}
