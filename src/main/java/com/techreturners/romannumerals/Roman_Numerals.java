package main.java.com.techreturners.romannumerals;


public class Roman_Numerals {

    public enum ConversionList {
        One("I", 1),
        Five("V", 5),
        Ten("X", 10);

        private String romanName = "";
        private int number = 0;

        ConversionList(String romanName, int number) {
            this.romanName = romanName;
            this.number = number;
        }
        public String getRomanName() {
            return romanName;
        }

        public int getNumeral() {
            return number;
        }
    }

    //PART - I
    public String convertNumberToRoman(int number){

        String resStr = "";
        int previousVal = 0;
        int currentVal = 0;
        String previousName = "";
        String currentName = "";

        for (ConversionList LIST_MAP : ConversionList.values()) {

            currentVal = LIST_MAP.getNumeral();
            currentName = LIST_MAP.getRomanName();

            int diff  = number - previousVal;
            //System.out.print(previousVal + diff);

            if ( (number == 1) || (number == 5) || (number == 10) ){
                if ( currentVal ==  number) {
                    resStr = currentName;
                    System.out.print(resStr + currentVal);
                    break;
                }
            }
            else if  (( previousVal < number) && ( previousVal != 0)) {

                if (diff == 1) {
                    resStr = previousName + resStr;
                }

                else {
                    for (int i = 1; i <=number; i++) {
                        resStr = resStr + previousName;
                        System.out.print("I am");
                    }

                }
                System.out.print(resStr);
            }

            previousVal = LIST_MAP.getNumeral();
            previousName = LIST_MAP.getRomanName();
        }

        return resStr;

        /*
        switch(number){
            case 1:
                return "I";
            case 5:
                return "V";
            case 10:
                return "X";
            default:
                return "Wrong, Please enter a correct number";
        }
        */


    }

    //PART - II
    public int convertRomanToNumber(String str){
        if (str.equals("I"))
            return 1;
        else return 0;
    }
}
