abstract class Vehicle{
	enum VehicleType {CAR, MOTORCYCLE, TRUCK, BICYCLE};
	protected String model;
	protected int year;
	protected VehicleType type;
	
	public Vehicle(String model,int year,VehicleType type){
		this.model = model;
		this.year = year;
		this.type = type;
	}
	abstract void startEngine();
	abstract void stopEngine();
}
