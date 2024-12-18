package homework_nr_17;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private ArrayList <T> arrayList = new ArrayList<>();

    public void addItem(T item) {
        arrayList.add(item);
    }

    public List<T> getItems() {
        return arrayList;
    }
}
