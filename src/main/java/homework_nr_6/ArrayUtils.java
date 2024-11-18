package homework_nr_6;

public class ArrayUtils {

    public static int findMax(int[] numbers){

        int max = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if (numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMin(int[] numbers){

        int min = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {

        int[] numbersArray = new int[]{
                5,7,12,3
        };

        findMax(numbersArray);
        findMin(numbersArray);

        System.out.println(findMax(numbersArray));
        System.out.println(findMin(numbersArray));


        }
}
