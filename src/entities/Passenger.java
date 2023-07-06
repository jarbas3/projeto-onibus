package entities;

public class Passenger {

	private String name;
	private String origin;
	private String destiny;
	
	public Passenger(String name, String origin, String destiny) {
		this.name = name;
		this.origin = origin;
		this.destiny = destiny;
	}
	
	public String getName() {
		return name;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public String getDestiny() {
		return destiny;
	}
	
	@Override
	public String toString() {
		return name + "," + origin + "," + destiny;
	}
}
