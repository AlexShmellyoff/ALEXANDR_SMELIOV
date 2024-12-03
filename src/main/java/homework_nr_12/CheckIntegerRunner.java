package homework_nr_12;

public class CheckIntegerRunner {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = -8;
        int i3 = 32;
        int i4 = 45;

        int[] numbers = {i1, i2, i3, i4};


for (int number: numbers) {
    for (CheckInteger checkInteger : CheckInteger.values()) {
        boolean result = checkInteger.test(number);
        System.out.println(number + " " + checkInteger + ": " + result);
    }
}




    }

}
