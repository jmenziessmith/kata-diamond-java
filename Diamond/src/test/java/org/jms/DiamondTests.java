package org.jms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiamondTests {

    @Test
    public void Create_A()
    {
        // arrange
        var letter = 'A';

        // act
        var diamond = Diamond.Create(letter);
        var result = diamond.getText();

        // assert
        Assertions.assertNotNull(result);
        Assertions.assertEquals("A", result);
    }

    @Test
    public void Create_B()
    {
        // arrange
        var letter = 'B';

        // act
        var diamond = Diamond.Create(letter);
        var result = diamond.getText();

        // assert
        Assertions.assertNotNull(result);

        String expected =
                  " A \n"
                + "B B\n"
                + " A \n";

        Assertions.assertEquals(expected, result);
    }



    @Test
    public void Create_C()
    {
        // arrange
        var letter = 'C';

        // act
        var diamond = Diamond.Create(letter);
        var result = diamond.getText();

        // assert
        Assertions.assertNotNull(result);

        String expected =
                  "  A  \n"
                + " B B \n"
                + "C   C\n"
                + " B B \n"
                + "  A  \n";


        Assertions.assertEquals(expected, result);
    }

    @Test
    public void Create_D()
    {
        // arrange
        var letter = 'D';

        // act
        var diamond = Diamond.Create(letter);
        var result = diamond.getText();

        // assert
        Assertions.assertNotNull(result);

        String expected = "   A   \n"
                        + "  B B  \n"
                        + " C   C \n"
                        + "D     D\n"
                        + " C   C \n"
                        + "  B B  \n"
                        + "   A   \n";

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void Create_E()
    {
        // arrange
        var letter = 'e';

        // act
        var diamond = Diamond.Create(letter);
        var result = diamond.getText();

        // assert
        Assertions.assertNotNull(result);

        String expected = "    A    \n"
                        + "   B B   \n"
                        + "  C   C  \n"
                        + " D     D \n"
                        + "E       E\n"
                        + " D     D \n"
                        + "  C   C  \n"
                        + "   B B   \n"
                        + "    A    \n";

        Assertions.assertEquals(expected, result);
    }


    @Test
    public void Create_F()
    {
        // arrange
        var letter = 'f';

        // act
        var diamond = Diamond.Create(letter);
        var result = diamond.getText();

        // assert
        Assertions.assertNotNull(result);

        String expected =
                  "     A     \n"
                + "    B B    \n"
                + "   C   C   \n"
                + "  D     D  \n"
                + " E       E \n"
                + "F         F\n"
                + " E       E \n"
                + "  D     D  \n"
                + "   C   C   \n"
                + "    B B    \n"
                + "     A     \n";

        Assertions.assertEquals(expected, result);
    }
}