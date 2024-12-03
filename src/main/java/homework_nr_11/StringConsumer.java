package homework_nr_11;

import java.util.function.Consumer;

public class StringConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        StringConsumer stringConsumer = new StringConsumer();
        stringConsumer.accept("Привет");
    }
}
