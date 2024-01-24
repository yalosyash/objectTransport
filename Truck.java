package objectTransport;

public class Truck extends Transport{
	
	private boolean isLoaded;
	
	public Truck(String name, float speed, int weight, String color, int[] coordinate, boolean isLoaded) {
		super(name, speed, weight, color, coordinate);
		this.isLoaded = isLoaded;
	}

	public void setLoaded(boolean loaded) {
		isLoaded = loaded;
	}
	
	public void getLoaded() {
		if(isLoaded)
			System.out.println("Truck is loaded!");
		else
			System.out.println("Truck is not loaded!");
	}
}
