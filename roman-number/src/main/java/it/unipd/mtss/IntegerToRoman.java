////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class IntegerToRoman {
  public static String convert(int number){
    StringBuilder romanNumber = new StringBuilder();
  String c ="I";
  if (number < 1 || number > 3) {
    throw new IllegalArgumentException("Number must be between 1 and 3");
}
else {
    for (int i = 0; i < number; i++) {;
    
        romanNumber.append("I"); 
      }}
      
      return romanNumber.toString();
  }
}