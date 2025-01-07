//CarRental class can extend the class Car and also implement the interface Rentable
//it can override and implement abstract methods of Rentable
class CarRental extends Car implements Rentable {
    private double dailyRate;

    //contructor
    public CarRental(String model, int year, double dailyRate) {
        super(model, year);
        this.dailyRate = dailyRate;
    }

    //overrides the abstract methods
    @Override
    public double rent(int days) {
        return dailyRate * days;
    }

    @Override
    public void returnItem() {
        System.out.println("Car has been returned.");
    }
}

public class RentalDriver {
    public static void main(String[] args) {
        // Create instances of vehicles and rentals
        CarRental carRental = new CarRental("SUV", 2021, 50.0);

        // Perform actions
        carRental.startEngine();
        carRental.stopEngine();

        double carRentalCost = carRental.rent(7);
        System.out.println("Car rental cost: $" + carRentalCost);
        carRental.returnItem();
    }
    
}
