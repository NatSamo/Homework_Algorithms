import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AscendingSequenceTest {


    @Order(1)
    @RepeatedTest(50)
    @Test
    public void testAscendingSequenceTestHappyPath(){
        //0, 1, 2, 3, 4, 5 - это предполагаемая последовательсностьб просто придумана чтоб получить happy path
        // не забывать ААА паттерн: Arrange, Act, Assert

        //Arrange
        int start = 0;
        int end = 5;
        int step = 1;
        int [] expectedResult = {0, 1, 2, 3, 4, 5};

        //здесь мы вызываем метод из другого класса, для этого надо создать новый объект того класса (as)
        //то есть мы можем вызвать объект от класса и сначала его нужно создать
        // Тип данных (он же название класса) имя объекта = нью название класса (конструктор по умолчанию) и пустые скобки;
        //Act:
        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        //Assert:
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testAscendingSequenceTestHappyPathNegativeNumbers(){
        //-10, -9, -8, -7 - это предполагаемая последовательсность, просто придумана чтоб получить happy path
        int start = -10;
        int end = -7;
        int step = 1;
        int [] expectedResult = {-10, -9, -8, -7};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testAscendingSequenceTestHappyPathPositiveNumbers(){
        //-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 - это предполагаемая последовательсность, просто придумана чтоб получить happy path
        int start = -5;
        int end = 5;
        int step = 1;
        int [] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testAscendingSequenceTestHappyPathTwoSteps(){
        //0, 1, 2, 3, 4, 5 - это предполагаемая последовательсность, просто придумана чтоб получить happy path
        int start = 0;
        int end = 5;
        int step = 2;
        int [] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceTestStartLargerThanEnd(){
        //передаем неправильные данные чтоб результат был пустым, это не хэппи пат
        int start = 5;
        int end = 0;
        int step = 2;
        int [] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceTestNegativeStep(){
        //передаем неправильные данные чтоб результат был пустым, это не хэппи пат
        int start = 5;
        int end = 0;
        int step = -2;
        int [] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceTestZeroStep(){
        //передаем неправильные данные чтоб результат был пустым, это не хэппи пат
        int start = 5;
        int end = 0;
        int step = 0;
        int [] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


}
