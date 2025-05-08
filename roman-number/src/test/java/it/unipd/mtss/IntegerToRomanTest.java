////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;

public class IntegerToRomanTest {
    @Test
    public void testConvertfirst10() {
        IntegerToRoman R=new IntegerToRoman();
        //ARRANGE
       String[] expectedOutcome = new String[10];
        expectedOutcome[0] = "I";
        expectedOutcome[1] = "II";
        expectedOutcome[2] = "III";
        expectedOutcome[3] = "IV";
        expectedOutcome[4] = "V";
        expectedOutcome[5] = "VI";
        expectedOutcome[6] = "VII";
        expectedOutcome[7] = "VIII";
        expectedOutcome[8] = "IX";
        expectedOutcome[9] = "X";
        //ACT
         String[] actualOutcome = new String[10];
         for (int i = 0; i < 10; i++) {
              actualOutcome[i] = R.convert(i + 1);
        //ASSERT
            assertEquals(expectedOutcome[i], actualOutcome[i]);
            }
    }
    @Test
    public void testConvertAbove10(){
        IntegerToRoman R=new IntegerToRoman();
        //ARRANGE
        String[] expectedOutcome = new String[15];
        expectedOutcome[0] = "XV";
        expectedOutcome[1] = "XVI";
        expectedOutcome[2] = "XIX";
        expectedOutcome[3] = "XX";
        expectedOutcome[4] = "XXIX";
        expectedOutcome[5] = "XXX";
        expectedOutcome[6] = "XXXIV";
        expectedOutcome[7] = "XL";
        expectedOutcome[8] = "XLV";
        expectedOutcome[9] = "L";
        expectedOutcome[10] = "LXV";
        expectedOutcome[11] = "LXXX";
        expectedOutcome[12] = "XC";
        expectedOutcome[13] = "XCV";
        expectedOutcome[14] = "C";

        //ACT
        String[] actualOutcome = new String[15];
        actualOutcome[0] = R.convert(15);
        actualOutcome[1] = R.convert(16);
        actualOutcome[2] = R.convert(19);
        actualOutcome[3] = R.convert(20);
        actualOutcome[4] = R.convert(29);
        actualOutcome[5] = R.convert(30);
        actualOutcome[6] = R.convert(34);
        actualOutcome[7] = R.convert(40);
        actualOutcome[8] = R.convert(45);
        actualOutcome[9] = R.convert(50);
        actualOutcome[10] = R.convert(65);
        actualOutcome[11] = R.convert(80);
        actualOutcome[12] = R.convert(90);
        actualOutcome[13] = R.convert(95);
        actualOutcome[14] = R.convert(100);
        //ASSERT
        for (int i = 0; i < 15; i++) {
            assertEquals(expectedOutcome[i], actualOutcome[i]);
        }
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    
    @Test
    public void testConvertWithZero() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Number must be between 1 and 100");
        IntegerToRoman.convert(0);
    }
    
    @Test
    public void testConvertWithNegative() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Number must be between 1 and 100");
        IntegerToRoman.convert(-1);
    }
    
    @Test
    public void testConvertWithLargeNumber() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Number must be between 1 and 100");
        IntegerToRoman.convert(101);
    }
}