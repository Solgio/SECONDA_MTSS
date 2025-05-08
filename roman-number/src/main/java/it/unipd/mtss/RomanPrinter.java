////////////////////////////////////////////////////////////////////
// PIETRO GIULIO BASSI 2137999
// LORENZO SOLIGO 2101057
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        StringBuilder asciiArt = new StringBuilder();
        switch (romanNumber) {
            case "I":
                asciiArt.append("  ___ \n");
                asciiArt.append(" |_ _|\n");
                asciiArt.append("  | | \n");
                asciiArt.append("  | | \n");
                asciiArt.append(" |___|\n");
                break;
            case "II":
                asciiArt.append("  ___   ___ \n");
                asciiArt.append(" |_ _| |_ _|\n");
                asciiArt.append("  | |   | | \n");
                asciiArt.append("  | |   | | \n");
                asciiArt.append(" |___| |___|\n");
                break;
            case "III":
                asciiArt.append("  ___   ___   ___ \n");
                asciiArt.append(" |_ _| |_ _| |_ _|\n");
                asciiArt.append("  | |   | |   | | \n");
                asciiArt.append("  | |   | |   | | \n");
                asciiArt.append(" |___| |___| |___|\n");
                break;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral: " + romanNumber);
        }
        return asciiArt.toString();
    }
}
