package contructor;

public class Car {

	public String carModel;
	public Car(String carModel) {
		this.carModel = carModel;
		System.out.println(carModel);
	}
	
	public void setCarCodel(String carModel) {
		this.carModel = carModel;
		}
	public String getCarModel( ) {
		return carModel;
	}
}
