package homework_nr_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueValues {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("яблоко");
        listWithDuplicates.add("банан");
        listWithDuplicates.add("яблоко");
        listWithDuplicates.add("апельсин");
        listWithDuplicates.add("банан");

        Set<String> uniqueValues = getUniqueValues(listWithDuplicates);
        ArrayList<String> uniqueList = new ArrayList<>(uniqueValues);

        System.out.println("Уникальные значения:");
        for (int i = 0; i < uniqueList.size(); i++) {
            System.out.println(uniqueList.get(i));
        }
    }

    public static Set<String> getUniqueValues(ArrayList<String> list) {
        return new HashSet<>(list);
    }
}
