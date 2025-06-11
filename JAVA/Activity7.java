package Activity;

interface BicycleParts{
	int tyres = 2;
	int maxSpeed = 20;
}

interface BicycleOperations{
	void applyBrake(int decrementValue);
	void speedUp(int incrementValue);
}
class Bicycle implements BicycleOperations, BicycleParts{
	int gears;
	int currentSpeed;
	
	// Constructor
	Bicycle (int gears, int currentSpeed){
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	// Functions of implement
	@Override
	public void applyBrake(int decrementValue) {
		System.out.println("Cycle speed decreased");
		if(currentSpeed >= 0) {
			currentSpeed -= decrementValue;
		}
		else {
			System.out.println("Cycle Stopped");
		}
	}
	@Override
	public void speedUp(int incrementValue) {
		System.out.println("Cycle speed increased");
		if(currentSpeed <= maxSpeed) {
			currentSpeed += incrementValue;
		}
		else {
			System.out.println("Cycle at max speed!!");
		}
	}

// Function to describe bicycle
public void bicycleDesc() {
	System.out.println("Bicycle has " + gears + "gears " + tyres + " tyres and a max speed of " + maxSpeed);
	System.out.println("Its current speed is: " + currentSpeed);
}
}
class MountainBike extends Bicycle{
	int seatHeight;
	
	// Constructor
	MountainBike (int gears, int currentSpeed, int seatHeight){
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
	}
	
	// Setter
	public void setSeatHeight(int newValue) {
		this.seatHeight = newValue;
	}
	
	// Override for description function
	@Override
	public void bicycleDesc() {
		System.out.println("MountainBike has " + gears + "gears " + tyres + " tyres and a max speed of " + maxSpeed);
	    System.out.println("Current seat height is : " + seatHeight);
	    System.out.println("Current speed is : " +currentSpeed);
}
}

public class Activity7 {
	public static void main(String[] args) {
		
		Bicycle mb = new MountainBike(3, 0, 25);
		
		mb.bicycleDesc();
		mb.speedUp(20);
		mb.applyBrake(5);
		mb.bicycleDesc();
}
}
