import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
     void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
