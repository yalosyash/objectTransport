package objectTransport;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Transport car = new Transport("BMW", 250.5f, 2500, "White", new int[] {1, 2, 3});
		
		Transport truck = new Transport("Scania", 200.0f, 5000, "Red", new int[] {50, 165, 75});
		
		System.out.println(car.getValues());
	}
}