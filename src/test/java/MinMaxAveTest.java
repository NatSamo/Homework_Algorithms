import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test

    public void MinMaxAveTestValid_1() {

        //Test Data:
        //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestValidEmptyArray() {

        int[] array = {};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = new int[]{};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestNegative() {

        int[] array = {2, 4, 7, 10};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult = new int[]{};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestIndex1IsNegative() {

        int[] array = {2, 4, 7, 10};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult = new int[]{};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestIndex2IsNegative() {

        int[] array = {2, 4, 7, 10};
        int index1 = 2;
        int index2 = -3;
        int[] expectedResult = new int[]{};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestIndex1BiggerThanIndex2() {

        int[] array = {2, 4, 7, 10};
        int index1 = 3;
        int index2 = 2;
        int[] expectedResult = new int[]{};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestIndex1EqualIndex2() {

        int[] array = {2};
        int index1 = 0;
        int index2 = 0;
        int[] expectedResult = {2, 2, 2};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestZeroValues() {

        int[] array = {0, 0, 0, 0};
        int index1 = 1;
        int index2 = 2;
        int[] expectedResult = {0, 0, 0};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestTwoValues() {

        int[] array = {4, 20};
        int index1 = 0;
        int index2 = 1;
        int[] expectedResult = {4, 20, 12};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestIndex2IsOver() {

        int[] array = {4, 20};
        int index1 = 0;
        int index2 = 3;
        int[] expectedResult = {};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestIndexIsNegative() {

        int[] array = {4, 20};
        int index1 = -1;
        int index2 = 2;
        int[] expectedResult = {};

        MinMaxAve newArray = new MinMaxAve();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }




}