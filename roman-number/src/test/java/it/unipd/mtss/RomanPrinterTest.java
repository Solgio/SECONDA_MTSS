package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RomanPrinterTest {
    
    @Test
    public void shouldPrintI_WhenInputIs1() {
        //ARRANGE
        String expected = "  ___ \n" +
                         " |_ _|\n" +
                         "  | | \n" +
                         "  | | \n" +
                         " |___|\n";
        //ACT
        String result = RomanPrinter.print(1);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintII_WhenInputIs2() {
        //ARRANGE
        String expected = "  ___   ___ \n" +
                         " |_ _| |_ _|\n" +
                         "  | |   | | \n" +
                         "  | |   | | \n" +
                         " |___| |___|\n";
        //ACT
        String result = RomanPrinter.print(2);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintIII_WhenInputIs3() {
        //ARRANGE
        String expected = "  ___   ___   ___ \n" +
                         " |_ _| |_ _| |_ _|\n" +
                         "  | |   | |   | | \n" +
                         "  | |   | |   | | \n" +
                         " |___| |___| |___|\n";
        //ACT
        String result = RomanPrinter.print(3);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintIV_WhenInputIs4() {
        //ARRANGE
        String expected = "  ___  __     __\n" +
                         " |_ _| \\ \\   / /\n" +
                         "  | |   \\ \\ / / \n" +
                         "  | |    \\ V /  \n" +
                         " |___|    \\_/   \n";
        //ACT
        String result = RomanPrinter.print(4);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintV_WhenInputIs5() {
        //ARRANGE
        String expected = " __     __\n" +
                         " \\ \\   / /\n" +
                         "  \\ \\ / / \n" +
                         "   \\ V /  \n" +
                         "    \\_/   \n";
        //ACT
        String result = RomanPrinter.print(5);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintVI_WhenInputIs6() {
        //ARRANGE
        String expected = " __     __  ___ \n" +
                         " \\ \\   / / |_ _|\n" +
                         "  \\ \\ / /   | | \n" +
                         "   \\ V /    | | \n" +
                         "    \\_/    |___|\n";
        //ACT
        String result = RomanPrinter.print(6);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenInputIsZero() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenInputIsGreaterThan6() {
        RomanPrinter.print(7);
    }

     @Test
    public void testConstructor() {
        RomanPrinter printer = new RomanPrinter();
        assertNotNull(printer);
    }
}
