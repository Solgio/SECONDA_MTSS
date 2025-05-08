////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class IntegerToRoman {
  public static String convert(int number) {
    StringBuilder romanNumber = new StringBuilder();
    if (number < 1 || number > 1000) {
        throw new IllegalArgumentException("Number must be between 1 and 1000");
    } else {
        String[] romanSymbols = {"M","CM","D","CD","C","XC","L","XL","X", "IX", "V", "IV", "I"}; 
        int[] integerValues = {1000,900,500,400,100,90,50,40,10, 9, 5, 4, 1};    
        for (int i = 0; i < integerValues.length; i++) {
          while (number >= integerValues[i]) {
              romanNumber.append(romanSymbols[i]);
              number -= integerValues[i];
          }
      }
      return romanNumber.toString();
  }
}}