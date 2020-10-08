package contructor;

public class TestCar {

	public static void main(String[] args) {
		Car myCar = new Car("Toyota");
		
		
		myCar.setCarCodel("Lexus");
		System.out.println("I got a new car and it is a " + myCar.getCarModel());

	}

}
