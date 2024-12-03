package homework_nr_12;

public class FuelTypesRunner {

    public static void main(String[] args) {

        for (FuelTypes fuelType: FuelTypes.values()){
            System.out.println(fuelType + " - " + fuelType.isLiquidFuel());
        }

    }
}
