package homework_nr_17;

import java.util.ArrayList;
import java.util.List;

public class Warehouse <T>{

    private List<Storage<T>> storages = new ArrayList<>();

    public void addStorage(Storage<T> storage) {
        storages.add(storage);
    }

    public int getTotalItemCount() {
        int totalCount = 0;
        for (Storage<T> storage : storages) {
            totalCount += storage.getItems().size();
        }
        return totalCount;
    }
}
