import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> book = new TreeMap<>();
    public int add(String name, String number) {
        book.put(name, number);
        return book.size();
    }
}
