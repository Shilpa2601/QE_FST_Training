package Activity;

public class Car {
	 String color;
	  String transmission;
	  int make;
	  int tyres;
	  int doors;
	  
	  Car(String color, String transmission, int make) {
		  this.color = color;
		  this.transmission = transmission;
		  this.make = make;
		  this.tyres = 4;
		  this.doors=4;

	}
	void displayCharecteristics() {
		 System.out.println("Color of the car is: "+ this.color);
		 System.out.println("Transmission of the car is: " +this.transmission);
		 System.out.println("Car was made in: " +this.make);
		 System.out.println("It has " +this.tyres +"tyres and " +this.doors +"doors ");
	 }
	 void accelerate(){
		 System.out.println("Car moves forward");
		 }
	 void brake() {
		 System.out.println("Car has stopped");
	 }
}
