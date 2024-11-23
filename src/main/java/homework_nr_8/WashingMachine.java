package homework_nr_8;

public class WashingMachine extends Appliance{
    double loadCapacity;

    public WashingMachine(String brand, int power, double loadCapacity) {
        super(brand, power);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String turnOn() {
        return "Washing machine is now washing clothes.";
    }

    //Реализуйте метод turnOn() так, чтобы он возвращал строку: “Washing machine is now washing clothes.”
}
