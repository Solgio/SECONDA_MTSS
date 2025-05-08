////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        if (num < 1 || num > 3) {
            throw new IllegalArgumentException("Number must be between 1 and 3");
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){

        StringBuilder asciiArt = new StringBuilder();
        String[][] asciiI = {

            {
                "  ___ "      // I
            },
            {
                " |_ _|"
            },
            {   
                "  | | "
            },
            {
                "  | | "
            },
            {
                " |___|"
            }
        };

        for (int i = 0; i < 5; i++) {
            for( int j = 0; j < romanNumber.length(); j++) {
                asciiArt.append(asciiI[i][0]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
    
}