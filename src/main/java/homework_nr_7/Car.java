package homework_nr_7;

public class Car extends Vehicle{

    private int numberOfDoors;
    private boolean isElectric;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public Car(String brand, String model, int year, int numberOfDoors, boolean isElectric) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Is Electric: " + isElectric);

    }
}
