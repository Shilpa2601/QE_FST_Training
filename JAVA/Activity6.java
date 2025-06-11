package Activity;

import java.util.*;

class Plane {
	private List<String> passengers;
	private final int maxPassengers;
	private Date lastTimeTookOff;
	private Date lastTimeLanded;

	public Plane(int maxPassengers){
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	
	}
	public void onBoard(String passengerName) {
		if(passengers.size() <= maxPassengers) {
			this.passengers.add(passengerName);
		}
		else {
			System.out.println("Plane is full");
		}
	}
	
	//Setter()
	public Date setTakeOff() {
		this.lastTimeTookOff = new Date();
		return lastTimeTookOff;
	}
	public void setLand() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	//Getter()
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	public List<String> getPassengers(){
		return passengers;
	}
}

public class Activity6 {
public static void main(String[] args) {
	
	//Plane with max of 10 passengers
	Plane plane = new Plane(10);
	
	//Add passengers
	plane.onBoard("John");
	plane.onBoard("Steve");
	plane.onBoard("Ana");
	
	//Plane takeOffs
	System.out.println("Plane took off at : " + plane.setTakeOff());
	
	// Print list of people onBoard
	
	System.out.println("People on the plane : " + plane.getPassengers());
	
	// Flying........
	
	//Thread.sleep(5000);
	
	// Plane has landed
	
	plane.setLand();  //Plane lands
	
	System.out.println("Plane landed at : " + plane.getLastTimeLanded());
	System.out.println("People on the plane after landing : " + plane.getPassengers());
	
}
}
