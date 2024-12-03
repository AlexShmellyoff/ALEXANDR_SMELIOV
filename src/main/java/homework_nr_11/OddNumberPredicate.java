package homework_nr_11;

import java.util.function.Predicate;

public class OddNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


        OddNumberPredicate oddNumberPredicate = new OddNumberPredicate();
        boolean result = oddNumberPredicate.test(5);
        System.out.println(result);

    }
}
