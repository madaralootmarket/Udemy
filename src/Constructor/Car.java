package Constructor;

public class Car {
	private String make;
	String model;
	float speed;
	int gear;
	
	public Car(){
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing Constructor Without arguments");
	}
	
	public Car(float speed , int gear){
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing Constructor with arguments ");
	}
	
	public Car(String model ,float speed , int gear){
		this.model = model;
		this.speed = speed;
		this.gear = gear;
	}
	

	public void setMake(String make){
		this.make = make;
	}
	
	public String getMake(){
		return make;
	}

}
