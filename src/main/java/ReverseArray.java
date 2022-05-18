public class ReverseArray {

    //11. Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
    //Test Data:
    //{2, 7, 3, 10} → {10, 3, 7, 2}

    public int[] reverseArray(int[] array){
        int[] revArr = new int[array.length];
        int index = array.length - 1;

        if (array.length != 0){
            for (int i = 0; i < array.length; i++){
                revArr[index] = array[i];
                index--;
            }
        } else {
            return new int[]{};
        } return revArr;

    }
}
