////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        if (num < 1 || num > 50) {
            throw new IllegalArgumentException("Number must be between 1 and 50");
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){

        StringBuilder asciiArt = new StringBuilder();
        String[][] ascii = {
            // I              V            X            L
            {"  ___ ", " __     __", " __    __", "  _     "},
            {" |_ _|", " \\ \\   / /", " \\ \\  / /", " | |    "},
            {"  | | ", "  \\ \\ / / ", "  \\ \\/ / ", " | |    "},
            {"  | | ", "   \\ V /  ", "  / /\\ \\ ", " | |___ "},
            {" |___|", "    \\_/   ", " /_/  \\_\\", " |_____|"},
        };

        for (int i = 0; i < 5; i++) {
            for (char r : romanNumber.toCharArray()) {
                if (r == 'I') {
                    asciiArt.append(ascii[i][0]);
                } else if (r == 'V') {
                    asciiArt.append(ascii[i][1]);
                } else if (r == 'X') {
                    asciiArt.append(ascii[i][2]);
                } else if (r == 'L') {
                    asciiArt.append(ascii[i][3]);
                }
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
    
}