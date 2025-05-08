////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        if (num < 1 || num > 6) {
            throw new IllegalArgumentException("Number must be between 1 and 6");
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){

        StringBuilder asciiArt = new StringBuilder();
        String[][] ascii = {
                 // I        V
                 {"  ___ ", " __     __"},
                 {" |_ _|", " \\ \\   / /"},
                 {"  | | ", "  \\ \\ / / "},
                 {"  | | ", "   \\ V /  "},
                 {" |___|", "    \\_/   "}     
        };

        for (int i = 0; i < 5; i++) {
            for (char r : romanNumber.toCharArray()) {
                if (r == 'I') {
                    asciiArt.append(ascii[i][0]);
                } else if (r == 'V') {
                    asciiArt.append(ascii[i][1]);
                }
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
    
}