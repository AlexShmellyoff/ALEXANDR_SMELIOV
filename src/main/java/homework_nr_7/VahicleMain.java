package homework_nr_7;

public class VahicleMain {
    public static void main(String[] args) {

        Car teslaCar = new Car("Tesla", "Model S", 2023, 4, true);
        Motorcycle yamahaMoto = new Motorcycle("Yamaha", "YZF-R3", 2021, 321.0, true);

        teslaCar.displayInfo();
        System.out.println("=========");
        yamahaMoto.displayInfo();
    }
}
