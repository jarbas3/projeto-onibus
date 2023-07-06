package entities;

public class Seat {

	private int number;
	private String info;
	private Passenger passenger;
	
	public Seat() {
	}
	
	public Seat(Passenger passenger) {
		this.passenger = passenger;
	}
	
	public Seat(int number, String info) {
		super();
		this.number = number;
		this.info = info;
	}
	
	public Seat(int number, String info, Passenger passenger) {
		this.number = number;
		this.info = info;
		this.passenger = passenger;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}	
	
	@Override
	public String toString() {
		return number + "," + info + "," + passenger;
	}
}
