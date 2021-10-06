package vehicle.compile.poly;

public class Vehicle {
	double vehiclePrice;
	String vehicleName;
	String vehicleColor;
	
	public Vehicle(double vehiclePrice, String vehicleName, String vehicleColor) {
		super();
		this.vehiclePrice = vehiclePrice;
		this.vehicleName = vehicleName;
		this.vehicleColor = vehicleColor;
	}
	
	public void getVehicleSpecifications() {
		System.out.println("Vehicle Name: " + this.vehicleName + "\nVehicle Color: " + this.vehicleColor +
				"\nVehicle Price: " + this.vehiclePrice);
	}
	
	public void getVehicleSpecifications(int horsepower, String type) {
		System.out.println("Vehicle Horsepower: " + horsepower + "\nVehicle Type: " + type);
	}
}
