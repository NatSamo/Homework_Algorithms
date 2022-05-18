import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberPositive() {
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber posV = new IsPositiveNumber();
        boolean actualResult = posV.isPositiveNumber(number);

        Assertions.assertSame(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberPositiveNegNumber() {
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber posV = new IsPositiveNumber();
        boolean actualResult = posV.isPositiveNumber(number);

        Assertions.assertSame(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberPositiveZero() {
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber posV = new IsPositiveNumber();
        boolean actualResult = posV.isPositiveNumber(number);

        Assertions.assertSame(expectedResult, actualResult);
    }
}
