public class SortArray {

    public int[] sortArray(int[] array){
        int[] sortArr = new int[array.length];
        int index = 0;

        if (array.length == 0) {
            return new int[]{};
        }
            for (int i = 0; i < array.length; i++){
                for (int j = i + 1; j < array.length; j++) {
                    int count;

                    if (array[i] > array[j]) {
                        count = array[i];
                        array[i] = array[j];
                        array[j] = count;
                    }
                }
            }
         return sortArr;
    }
}

