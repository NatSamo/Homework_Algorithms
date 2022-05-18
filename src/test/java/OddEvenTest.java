import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    //Задание 1.
    @Test
    public void testHW_9TestHappyPathOdd(){
        /*Test Data:
            -345 →  “Odd”
            0 →  “Even”
            222222 →  “Even”
            2147483647 + 1 →  “Undefined”*/
        int number = -345;
        String expectedResult = "Odd";

        OddEven oed = new OddEven();
        String actualResult = oed.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
        public void testHW_9TestHappyPathEven(){
        /*Test Data:
            -345 →  “Odd”
            0 →  “Even”
            222222 →  “Even”
            2147483647 + 1 →  “Undefined”*/
        int number = 0;
        String expectedResult = "Even";

        OddEven oed = new OddEven();
        String actualResult = oed.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testHW_9TestHappyPathEven_1(){
        /*Test Data:
            -345 →  “Odd”
            0 →  “Even”
            222222 →  “Even”
            2147483647 + 1 →  “Undefined”*/
        int number = 222222;
        String expectedResult = "Even";

        OddEven oed = new OddEven();
        String actualResult = oed.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testHW_9TestHappyPathUndefined(){
        /*Test Data:
            -345 →  “Odd”
            0 →  “Even”
            222222 →  “Even”
            2147483647 + 1 →  “Undefined”*/
        int number = (2147483647 + 1);
        String expectedResult = "Undefined";

        OddEven oed = new OddEven();
        String actualResult = oed.oddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }





}
