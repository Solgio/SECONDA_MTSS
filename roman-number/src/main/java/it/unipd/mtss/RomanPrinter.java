////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    public static String print(int num){
        if (num < 1 || num > 1000) {
            throw new IllegalArgumentException("Number must be between 1 and 1000");
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static final Map<Character, Integer> ROMAN_CHAR_INDICES = new HashMap<>();
    static {
        ROMAN_CHAR_INDICES.put('I', 0);
        ROMAN_CHAR_INDICES.put('V', 1);
        ROMAN_CHAR_INDICES.put('X', 2);
        ROMAN_CHAR_INDICES.put('L', 3);
        ROMAN_CHAR_INDICES.put('C', 4);
        ROMAN_CHAR_INDICES.put('D', 5);
        ROMAN_CHAR_INDICES.put('M', 6);
    };


    private static String printAsciiArt(String romanNumber){

        StringBuilder asciiArt = new StringBuilder();
        String[][] ascii = {
              // I              V            X            L         C          D            M 
            {"  ___ ", " __     __", " __    __", "  _     ", "   ____ ", "  ____  ", "  __  __ "},
            {" |_ _|", " \\ \\   / /", " \\ \\  / /", " | |    ", "  / ___|", " |  _ \\ ", " |  \\/  |"},
            {"  | | ", "  \\ \\ / / ", "  \\ \\/ / ", " | |    ", " | |    ", " | | | |", " | |\\/| |"},
            {"  | | ", "   \\ V /  ", "  / /\\ \\ ", " | |___ ", " | |___ ", " | |_| |", " | |  | |"},
            {" |___|", "    \\_/   ", " /_/  \\_\\", " |_____|", "  \\____|", " |____/ ", " |_|  |_|"},
        };

        for (int i = 0; i < 5; i++) {
            for (char r : romanNumber.toCharArray()) {
                Integer index = ROMAN_CHAR_INDICES.get(r);
                if (index != null) {
                    asciiArt.append(ascii[i][index]);
                }
            }
            asciiArt.append("\n");  // Always add newline after each line
        }
        return asciiArt.toString();
    }
}