package homework_nr_9;

import java.util.HashMap;

public class Dictionary {

    public static void main(String[] args) {


        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "salut");
        dictionary.put("cat", "pisică");
        dictionary.put("dog", "câine");
        dictionary.put("house", "casă");
        dictionary.put("book", "carte");
        dictionary.put("tree", "copac");
        dictionary.put("water", "apă");
        dictionary.put("sun", "soare");
        dictionary.put("friend", "prieten");
        dictionary.put("love", "dragoste");

        System.out.println("Англо-румынский словарь:");

        Object[] keys = dictionary.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            String key = (String) keys[i];
            System.out.println(key + " - " + dictionary.get(key));
        }
    }
}
