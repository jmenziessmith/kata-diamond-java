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
}