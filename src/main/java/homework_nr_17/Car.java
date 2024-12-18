package homework_nr_17;

import java.util.List;

public class Car extends Vehicle {

    private String fuelType;

    public Car(String model, int year, String fuelType) {
        super(model, year);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип топлива: " + fuelType;
    }

    public static void copyVehicles(List<? extends Vehicle> source, List<? super Vehicle> destination) {
        for (Vehicle vehicle : source) {
            destination.add(vehicle);
        }
    }
}
