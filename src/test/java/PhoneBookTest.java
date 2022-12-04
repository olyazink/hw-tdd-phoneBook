import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int expected = 1;
        int actual = phoneBook.add("test", "123");
        assertEquals(expected, actual);
    }
}
