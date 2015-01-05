import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testsNormalName() {
        String input = "Dereck Robert Yssirt";
        String expected = "DRY";

        Person p = new Person(input);
        String output = p.getInitials();

        assertEquals(output, expected);
    }
    @Test
    public void testsParanormalName() {
        String input = "Dereck Robert      Yssirt";
        String expected = "DRY";

        Person p = new Person(input);
        String output = p.getInitials();

        assertEquals(output, expected);
    }
}
