import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void reverseArrayTestPositive(){
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray revA = new ReverseArray();
        int[] actualResult = revA.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
