package homework_nr_5;

public class HomeWorkNr5 {

    public static void main(String[] args) {


        int[] numbers = new int[100];

        int value = 100;

        int i;
        for (i = 0; i < numbers.length; i++){
            numbers[i] = value;
            value = value -1;
        }
        for(i = 0; i < numbers.length; i++) {
            System.out.println("Number " + i);
        }

        int sumEven;
        long productOdd;

        sumEven = 0;
        productOdd = 1;

        for(i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                sumEven = sumEven + numbers[i];
            } else {
                productOdd = productOdd * numbers[i];
            }
        }

        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Произведение нечетных чисел: " + productOdd);

        int[] copyNumbers = new int[100];

        for(i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
    }


}
