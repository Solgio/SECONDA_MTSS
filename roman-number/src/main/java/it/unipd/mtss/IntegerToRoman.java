////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class IntegerToRoman {
  public static String convert(int number){
    StringBuilder romanNumber = new StringBuilder();
  if (number < 1 || number > 10) {
    throw new IllegalArgumentException("Number must be between 1 and 10");
}
else {
  if(number <= 3){
    for (int i = 0; i < number; i++) {
        romanNumber.append("I"); 
      }}
  if (number == 4) {
    romanNumber.append("IV");}
  if (number == 5) {
    romanNumber.append("V");}
  if (number == 6) {
    romanNumber.append("VI");}
  
  if (number == 7) {
    romanNumber.append("VII");}
  if (number == 8) {
    romanNumber.append("VIII");}
  if (number == 9) {
    romanNumber.append("IX");}
  if (number == 10) {
    romanNumber.append("X");}
  }
  return romanNumber.toString();
}}