package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger   {

    CHECK_IF_ODD(number -> number % 2 != 0),
    CHECK_IF_EVEN(number -> number % 2 == 0),
    CHECK_IF_NEGATIVE(number -> number < 0),
    CHECK_IF_POSITIVE(number -> number > 0);

    private final Predicate<Integer> checker;

    CheckInteger(Predicate<Integer> checker) {
        this.checker = checker;
    }

    public boolean test (Integer number){
        return checker.test(number);
    }
}