import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayOfWeekTest {

    @Test
    void isMonday() {
        String result = DayOfWeek.nameTheDayOfTheWeek(1);

        Assertions.assertEquals("Monday", result);
    }

    @Test
    void isWednesday() {
        String result = DayOfWeek.nameTheDayOfTheWeek(3);

        Assertions.assertEquals("Wednesday", result);
    }

    @Test
    void isWeekend() {
        String result = DayOfWeek.nameTheDayOfTheWeek(7);

        Assertions.assertEquals("Weekend", result);
    }

    @Test
    void isNoSuchDay() {
        String result = DayOfWeek.nameTheDayOfTheWeek(12);

        Assertions.assertEquals("There is no such a day!", result);
    }
}
