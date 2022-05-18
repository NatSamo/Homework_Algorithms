public class IntegerM {

    public String integerM (int m){
        String goodNum = "Хорошее число";
        String wrongNum = "Неверное число";
        String badNum = "Плохое число";
        String notNum = "-1";

        if (m % 3 == 0 && m % 5 == 0){
            return goodNum;
        } else if (m % 3 == 0 && m % 5 != 0){
            return wrongNum;
        } else if (m % 3 != 0 && m % 5 == 0){
            return badNum;
        } else {
            return notNum;
        }
    }
}
