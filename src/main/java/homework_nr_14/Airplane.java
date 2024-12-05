package homework_nr_14;

public class Airplane {

    String manufacturer;
    String model;
    int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) {
        if (manufacturer == null || manufacturer.isEmpty()){
            throw new InvalidManufacturerException("Manufacturer cannot be null or empty.");
        }
        this.manufacturer = manufacturer;

        if (model == null || model.isEmpty()){
            throw new InvalidModelException("Model cannot be null or empty.");
        }
        this.model = model;

        if (nrOfEngines == 0 || nrOfEngines % 2 != 0){
            throw new InvalidNrOfEnginesException("nrOfEngines cannot be null or Odd.");
        }
        this.nrOfEngines = nrOfEngines;




    }

    public Airplane createAirplaneLBYL(String name, String model, int nrOfEngines) {
        if (name == null || name.isEmpty() || model == null || model.isEmpty() || nrOfEngines == 0 || nrOfEngines % 2 != 0) {
            System.out.println("Invalid parameters for Airplane.");
            return null;
        } else {
            return new Airplane(name, model, nrOfEngines);
        }
    }


    public Airplane createAirplaneEAFP(String name, String model, int nrOfEngines) {
        try {
            return new Airplane(name, model, nrOfEngines);
        } catch (InvalidManufacturerException | InvalidModelException | InvalidNrOfEnginesException e) {
            System.out.println("Error creating Airplane: " + e.getMessage());
            return null;
        }
    }

    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Lower limit cannot be greater than upper limit.");
        }

        int count = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        return count;
    }

    public void printNumbersDivisibleBy7(int inferiorLimit, int superiorLimit) {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Lower limit cannot be greater than upper limit.");
        }

        System.out.println("Numbers divisible by 7 in the range [" + inferiorLimit + ", " + superiorLimit + "]:");
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }



    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", "737", 2);

        Airplane newAirplaneLBYL = airplane.createAirplaneLBYL("Airbus", "A320", 2);
        if (newAirplaneLBYL != null) {
            System.out.println("LBYL: " + newAirplaneLBYL.manufacturer + ", " + newAirplaneLBYL.model + ", " + newAirplaneLBYL.nrOfEngines);
        }

        Airplane newAirplaneEAFP = airplane.createAirplaneEAFP("Boeing", "777", 2);
        if (newAirplaneEAFP != null) {
            System.out.println("EAFP: " + newAirplaneEAFP.manufacturer + ", " + newAirplaneEAFP.model + ", " + newAirplaneEAFP.nrOfEngines);
        }
    }




}
