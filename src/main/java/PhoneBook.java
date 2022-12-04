import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> book = new TreeMap<>();

    public int add(String name, String number) {
        book.put(name, number);
        return book.size();
    }

    public String findByNumber(String number) {
        String key = "";
        for (String k : book.keySet()) {
            if (book.get(k).equals(number)) {
                key = k;
                break;
            }
        }
        return key;
    }

    public String findByName(String name) {
        return book.get(name);
    }
}
