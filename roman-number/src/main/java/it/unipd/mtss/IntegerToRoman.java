////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class IntegerToRoman {
  public static String convert(int number){
  String c ="I";
  if (number < 1 || number > 3) {
    throw new IllegalArgumentException("Number must be between 1 and 3");
}
    if (number == 1) {
        c = "I";
    } else if (number == 2) {
        c = "II";
    } else if (number == 3) {
        c = "III";
    }
  return c;
  }
}