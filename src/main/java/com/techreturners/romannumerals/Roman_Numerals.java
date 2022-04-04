package main.java.com.techreturners.romannumerals;

public class Roman_Numerals {


    public String getRoman(int num, String a, String b, String c){
        switch(num) {
            case 1:
                return a;
            case 2:
                return a + a;
            case 3:
                return a + a + a;
            case 4:
                return a + b;
            case 5:
                return b;
            case 6:
                return b + a;
            case 7:
                return b + a + a;
            case 8:
                return b + a + a + a;
            case 9:
                return a + c;
            case 10:
                return c;
            default:
                return "Wrong, Please enter a correct number";
        }
    }


    //PART - I
    public String convertNumberToRoman(int number){

        String min = "";
        String mid = "";
        String max = "";

        String resStr = "";
        String intToStr = Integer.toString(number);

        int ones = number % 10;
        int tens = 0;

        if (intToStr.length() >= 2){
            ones = number % 10;
            tens = number / 10;
        }
        if (ones == 0) {
            resStr = getRoman(ones, min, mid, max);
        }
        if ( (ones < 10) && (ones != 0) ){
            min = "I";
            mid = "V";
            max = "X";
            resStr = getRoman(ones, min, mid, max);
        }
        if ( (tens > 0) && (tens <= 10) ){
            min = "X";
            mid = "L";
            max = "C";
            resStr = getRoman(tens, min, mid, max) + resStr;
            //System.out.println(resStr);
        }
        return resStr;

    }

    //PART - II

    public int getRange(String str){
        switch(str) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            default:
                return 0;
        }
    }

    public int convertRomanToNumber(String str){

        int result = 0;
        int prevResult = 0;

        if (str.length() == 1) {
            return getRange(str.substring(str.length()-1));
        }
        else {

            for (int i = 0; i < str.length(); i++) {
                int rangeVal = getRange(str.substring(i, i+1));

                if ((rangeVal > prevResult) && (prevResult > 0)){
                    result = getRange(str.substring(i, i+1)) - prevResult;
                }
                else {
                    result = result + getRange(str.substring(i, i + 1));
                    prevResult = result;
                }
            }
        }

        return result;
    }
}
