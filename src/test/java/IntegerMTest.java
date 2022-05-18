import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerMTest {

    @Test

    public void IntegerMPositiveBadNumber(){

        int m = 35;
        String expectedResult = "Плохое число";

        IntegerM numberM = new IntegerM();
        String actualResult = numberM.integerM(m);

        Assertions.assertEquals(expectedResult,actualResult);


    }

    @Test

    public void IntegerMPositiveGoodNumber(){

        int m = 15;
        String expectedResult = "Хорошее число";

        IntegerM numberM = new IntegerM();
        String actualResult = numberM.integerM(m);

        Assertions.assertEquals(expectedResult,actualResult);


    }

    @Test

    public void IntegerMPositiveWrongNumber(){

        int m = 9;
        String expectedResult = "Неверное число";

        IntegerM numberM = new IntegerM();
        String actualResult = numberM.integerM(m);

        Assertions.assertEquals(expectedResult,actualResult);


    }

    @Test

    public void IntegerMPositiveNotNumber(){

        int m = 22;
        String expectedResult = "-1";

        IntegerM numberM = new IntegerM();
        String actualResult = numberM.integerM(m);

        Assertions.assertEquals(expectedResult,actualResult);


    }
}
