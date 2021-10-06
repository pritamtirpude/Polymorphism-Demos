package vehicle.runtime.poly;

public abstract class Vehicle {
	
	double vehiclePrice;
	String vehicleName;
	String vehicleColor;
	
	public Vehicle(double vehiclePrice, String vehicleName, String vehicleColor) {
		super();
		this.vehiclePrice = vehiclePrice;
		this.vehicleName = vehicleName;
		this.vehicleColor = vehicleColor;
	}
	
	public void vehicleDisplay() {
		System.out.println("Vehicle Name: " + this.vehicleName + "\nVehicle Color: " + this.vehicleColor +
	 "\nVehicle Price: " + this.vehiclePrice);
	}
	
	public abstract void getVehicleSpecifications(String type, int horsepower, int mileage);
}
