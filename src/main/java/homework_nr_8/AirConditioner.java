package homework_nr_8;

public class AirConditioner extends Appliance {

    int coolingPower;
    boolean hasInverter;

    public AirConditioner(String brand, int power, int coolingPower, boolean hasInverter) {
        super(brand, power);
        this.coolingPower = coolingPower;
        this.hasInverter = hasInverter;
    }

    @Override
    public String turnOn() {
        return "Air conditioner is now cooling the room.";
    }

    @Override
    public void displayInfo() {
        System.out.println("This is an air conditioner with cooling power of " + coolingPower + " BTU and inverter: " + hasInverter);
    }
}
