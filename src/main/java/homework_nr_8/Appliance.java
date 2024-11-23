package homework_nr_8;

public abstract class Appliance {

    String brand;
    int power;

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String turnOn(){

        return "";
    }

    public void displayInfo(){
        this.turnOn();
    }
}
