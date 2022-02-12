package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int move) {
		System.out.println(move + "km走ります");
		this.fuelAmount -= (move / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
