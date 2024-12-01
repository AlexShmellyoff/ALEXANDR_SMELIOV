package homework_nr_8;

public class ApplianceMain {

    public static void main(String[] args) {

        WashingMachine w1 = new WashingMachine("LG", 2000, 7.5);
        Microwave m1 = new Microwave("Samsung", 1200, true);
        AirConditioner a1 = new AirConditioner("Daikin", 1500, 12000, true);

        Appliance appliances [] = new Appliance[] {
                w1, m1, a1
        };



        for (int i = 0; i != appliances.length; i++){
            appliances[i].displayInfo();

            if (appliances[i] instanceof WashingMachine){
                System.out.println("This is a washing machine with a load capacity of " +  w1.loadCapacity + "kg.");
            }
            if (appliances[i] instanceof Microwave){
                System.out.println("This is a microwave with a grill: " + m1.hasGrill);
            }
            if (appliances[i] instanceof AirConditioner){
                System.out.println("This is an air conditioner with cooling power of " + a1.coolingPower + " BTU and inverter: " + a1.hasInverter);
            }

        }
    }





}
