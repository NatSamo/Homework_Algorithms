public class OddEven {

    //1.Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и “Even”,
    // если число четное. Во всех остальных случаях результат будет “Undefined”.

    /*Test Data:
            -345 →  “Odd”
            0 →  “Even”
            222222 →  “Even”
            2147483647 + 1 →  “Undefined”*/
    public String oddEven(int number){
        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if (number == Integer.MAX_VALUE + 1){
            return undefined;
        } else if (number % 2 == 0){
           return even;
        } else if (number % 2 != 0){
            return odd;
        } else {
            return undefined;
        }
    }









}
