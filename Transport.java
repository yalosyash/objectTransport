package objectTransport;

public class Transport {
	
	private String name;
	private float speed;
	private int weight;
	private String color;
	private int[] coordinate;
	
	public Transport(String name, float speed, int weight, String color, int[] coordinate) {
		setValues(name, speed, weight, color, coordinate);
		System.out.println("Object " + name + " created!");
		System.out.println(getValues());
	}
	
	public void setValues(String name, float speed, int weight, String color, int[] coordinate) {
		this.name = name;
		this.speed = speed;
		this.weight = weight;
		this.color = color;
		this.coordinate = coordinate;
	}
	
	public String getValues() {
		String info = "Name: " + name + 
					  "\nSpeed: " + this.speed +
					  "\nWeight: " + this.weight +
					  "\nColor: " + this.color;
		String infoCoordinates = "\nCoordinates:\n";
		
		for(int i = 0; i < this.coordinate.length; i++) {
			if(i == coordinate.length - 1) {
				infoCoordinates += this.coordinate[i] + "\n";
				break;
			}
			infoCoordinates += this.coordinate[i] + ", "; 
		}
		
		return info + infoCoordinates;
	}
}