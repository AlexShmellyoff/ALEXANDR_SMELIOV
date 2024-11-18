package homework_nr_6;

public class NumberUtils {

    private static Boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void findPrimesInArray(int[] numbers){

        for (int i = 0; i < numbers.length; i++){
            if (isPrime(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }

    }

    public static void main(String[] args) {

        int [] numbersArray = new int[]{
                5,7,12,38,55
        };

        findPrimesInArray(numbersArray);


    }
}
