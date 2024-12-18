package homework_nr_17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Vehicle tesla = new Vehicle("Tesla", 2023);
        Vehicle ford = new Vehicle("Ford", 2017);
        Car bmw = new Car("BMW", 2022, "Diesel");

        Storage<Vehicle> storage1 = new Storage<>();
        storage1.addItem(tesla);
        storage1.addItem(ford);

        Storage<Vehicle> storage2 = new Storage<>();
        storage2.addItem(bmw);

        Warehouse<Vehicle> warehouse = new Warehouse<>();
        warehouse.addStorage(storage1);
        warehouse.addStorage(storage2);

        System.out.println("Общее количество транспортных средств в хранилищах: " + warehouse.getTotalItemCount());

        List<Vehicle> source = new ArrayList<>();
        source.add(tesla);
        source.add(ford);
        source.add(bmw);

        List<Object> destination = new ArrayList<>();
        Car.copyVehicles(source, destination);

        System.out.println("Список назначения после копирования:");
        for (Object obj : destination) {
            System.out.println(obj);
        }

        Predicate<Vehicle> yearAfter2018 = vehicle -> vehicle.getYear() > 2018;
        List<Vehicle> filteredVehicles = FilterUtils.filter(source, yearAfter2018);

        System.out.println("Транспортные средства, выпущенные после 2018 года:");
        for (Vehicle vehicle : filteredVehicles) {
            System.out.println(vehicle);
        }
    }
}
