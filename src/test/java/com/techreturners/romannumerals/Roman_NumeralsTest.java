package test.java.com.techreturners.romannumerals;

import main.java.com.techreturners.romannumerals.Roman_Numerals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Roman_NumeralsTest {

    private int actualResult;


    @Test
    public void checkForRomanNumeralOne(){
        //Arrange
        Roman_Numerals romanNumerals = new Roman_Numerals();

        //Act
        actualResult = romanNumerals.convertRomanToInteger("I");

        //Assert
        Assertions.assertEquals(1, actualResult);
    }
}
