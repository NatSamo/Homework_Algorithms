public class OddIndices {

    //2. Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public int[] oddIndices(int[] array){
        int[] oddIndices = new int[array.length / 2];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (i % 2 != 0){
                oddIndices[j] = array[i];
                j++;
            } else if (array.length == 0){
                return new int[]{};
            }
        } return oddIndices;
    }
}
