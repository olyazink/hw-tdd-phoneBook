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
    @Test
    void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("test", "123");
        String expected = "test";
        String actual = phoneBook.findByNumber("123");
        assertEquals(expected, actual);
    }

    @Test
    void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("test", "123");
        String expected = "123";
        String actual = phoneBook.findByName("test");
        assertEquals(expected, actual);
    }
}
