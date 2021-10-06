package vehicle.runtime.poly;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bike(800000, "Ducati","Red");
		vehicle.vehicleDisplay();
		vehicle.getVehicleSpecifications("Bike", 216, 10);
	}

}
