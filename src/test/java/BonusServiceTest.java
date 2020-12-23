import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;


class BonusServiceTest {

    @Test
    void ShouldCalculateRegisteredAndAnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test

    void ShouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test

    void ShouldCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test

    void ShouldCalculateNotRegisteredAndAnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}

