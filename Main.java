package objectTransport;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Car car	 = new Car("BMW", 250.5f, 2500, "White", new int[] {1, 2, 3});
		
		Truck truck = new Truck("Scania", 200.0f, 5000, "Red", new int[] {50, 165, 75}, false);
		
		truck.setLoaded(true);
		truck.getLoaded();
//		System.out.println(car.getValues());
	}
}