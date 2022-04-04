package test.java.com.techreturners.romannumerals;

import main.java.com.techreturners.romannumerals.ConversionList;
import main.java.com.techreturners.romannumerals.Roman_Numerals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Roman_NumeralsTest {

    private int intActualResult;
    private String strActualResult;

    //PART - I
    @Test
    public void checkForNumberToRomanOne(){
        //Arrange
        Roman_Numerals romanNumerals = new Roman_Numerals();
        //ConversionList numberOne = ConversionList.I;

        //Act
        strActualResult = romanNumerals.convertNumberToRoman(4);

        //Assert
        Assertions.assertEquals("IV", strActualResult);
    }

    /*
    @Test
    public void checkForNumberToRomanTwo(){
        //Arrange
        Roman_Numerals romanNumerals = new Roman_Numerals();

        //Act
        strActualResult = romanNumerals.convertNumberToRoman(2);

        //Assert
        Assertions.assertEquals("II", strActualResult);
    }

    @Test
    public void checkForNumberToRomanFail(){
        //Arrange
        Roman_Numerals romanNumerals = new Roman_Numerals();

        //Act
        strActualResult = romanNumerals.convertNumberToRoman(0);

        //Assert
        Assertions.assertEquals("Wrong, Please enter a correct number", strActualResult);
    }


    // PART - II
    @Test
    public void checkForConvertRomanToNumberOne(){
        //Arrange
        Roman_Numerals romanNumerals = new Roman_Numerals();

        //Act
        intActualResult = romanNumerals.convertRomanToNumber("I");

        //Assert
        Assertions.assertEquals(1, intActualResult);
    }
    */

}
