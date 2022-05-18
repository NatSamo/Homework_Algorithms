import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
    //Задание 2.
    @Test
    public void testHW_9TestPositiveOddIndices() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testHW_9TestPositiveOddIndicesZeros() {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testHW_9TestNegativeOddIndicesEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testHW_9TestPositiveOddIndicesOneValueArray() {
        int[] array = {25};
        int[] expectedResult = {};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
