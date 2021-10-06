package vehicle.runtime.poly;

public class Bike extends Vehicle{

	public Bike(double vehiclePrice, String vehicleName, String vehicleColor) {
		super(vehiclePrice, vehicleName, vehicleColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getVehicleSpecifications(String type, int horsepower, int mileage) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Type: " + type + "\nVehicle Horsepower: " + horsepower + "\nVehicle Mileage: " + mileage);
	}

}
