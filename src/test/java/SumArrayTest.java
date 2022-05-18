import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayTestPositive_1() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray suA = new SumArray();
        int actualResult = suA.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayTestPositive_2() {
        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray suA = new SumArray();
        int actualResult = suA.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayTestNegativeEmptyArray() {
        int[] array = {};
        int expectedResult = 0;

        SumArray suA = new SumArray();
        int actualResult = suA.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayTestNegativeOneValueArray() {
        int[] array = {5};
        int expectedResult = 5;

        SumArray suA = new SumArray();
        int actualResult = suA.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
