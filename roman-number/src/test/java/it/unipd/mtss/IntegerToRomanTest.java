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
    public void testConvertfirst6() {
        IntegerToRoman R=new IntegerToRoman();
        //ARRANGE
       String[] expectedOutcome = new String[6];
       expectedOutcome[0] = "I";
       expectedOutcome[1] = "II";
       expectedOutcome[2] = "III";
       expectedOutcome[3] = "IV";
       expectedOutcome[4] = "V";
       expectedOutcome[5] = "VI";
        //ACT
         String[] actualOutcome = new String[6];
         for (int i = 0; i < 6; i++) {
              actualOutcome[i] = R.convert(i + 1);
        //ASSERT
            assertEquals(expectedOutcome[i], actualOutcome[i]);
            }
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    
    @Test
    public void testConvertWithZero() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Number must be between 1 and 6");
        IntegerToRoman.convert(0);
    }
    
    @Test
    public void testConvertWithNegative() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Number must be between 1 and 6");
        IntegerToRoman.convert(-1);
    }
    
    @Test
    public void testConvertWithLargeNumber() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Number must be between 1 and 6");
        IntegerToRoman.convert(7);
    }
}