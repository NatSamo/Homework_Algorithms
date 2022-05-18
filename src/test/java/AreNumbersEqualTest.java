import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Test Data:
//89, 89
//Expected result: 0
//-89, 89
//Expected result: -1
//89, -89
//Expected result: 1

public class AreNumbersEqualTest {

    @Test

        public void AreNumbersEqualPositive_1(){

        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual aNeq = new AreNumbersEqual();
        int actualResult = aNeq.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult,actualResult);
}

    @Test

    public void AreNumbersEqualPositive_2(){

        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual aNeq = new AreNumbersEqual();
        int actualResult = aNeq.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test

    public void AreNumbersEqualPositive_3(){

        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual aNeq = new AreNumbersEqual();
        int actualResult = aNeq.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

