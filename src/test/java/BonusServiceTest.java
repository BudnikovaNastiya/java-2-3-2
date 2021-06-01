import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BonusServiceTest {
    @Test
     void calculateService() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculateService(amount, registered);
        assertEquals(expected, actual);
    }
}
