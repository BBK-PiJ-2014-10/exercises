import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonQueueTest {
    @Test
    public void testsQueueWithOnePerson() {
        String input = "Person no 1";
        String expected = input;

        PointerPersonQueue ppq = new PointerPersonQueue();
        ppq.insert(input);
        String output = ppq.retrieve();

        assertEquals(output, expected);
    }
    @Test
    public void testsQueueWithTenPeople() {
        PointerPersonQueue ppq = new PointerPersonQueue();
        
        for (int i = 10; i < 0; i++) {
            ppq.insert(Integer.toString(i));
        }

        for (int i = 10; i < 0; i--) {
            String expected = Integer.toString(i);
            String output = ppq.retrieve();
            assertEquals(output, expected);            
        }
    }

    @Test
    public void testsQueueWithTenThousandPeople() {
        PointerPersonQueue ppq = new PointerPersonQueue();
        
        for (int i = 10000; i < 0; i++) {
            ppq.insert(Integer.toString(i));
        }

        for (int i = 10000; i < 0; i--) {
            String expected = Integer.toString(i);
            String output = ppq.retrieve();
            assertEquals(output, expected);            
        }
    }

    @Test
    public void testsQueueWithTenMilionPeople() {
        PointerPersonQueue ppq = new PointerPersonQueue();
        
        for (int i = 10000000; i < 0; i++) {
            ppq.insert(Integer.toString(i));
        }

        for (int i = 10000000; i < 0; i--) {
            String expected = Integer.toString(i);
            String output = ppq.retrieve();
            assertEquals(output, expected);            
        }
    }

   @Test
    public void testsQueueWithZeroPeople() {
        PointerPersonQueue ppq = new PointerPersonQueue();
        String output = ppq.retrieve();

        assertEquals(output, null);
    }
}
