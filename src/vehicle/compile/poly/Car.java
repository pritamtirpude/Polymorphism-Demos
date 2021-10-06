package vehicle.compile.poly;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle(500000, "Mercedes-Benz C Class", "Obsidian Black");
		vehicle.getVehicleSpecifications();
		vehicle.getVehicleSpecifications(190, "Car");
	}

}
