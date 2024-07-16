package dev.anto;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArmstrongTest {
    
@Test
    public void testIsArmstrong() {
        assertTrue(Armstrong.isArmstrong(370));
        assertTrue(Armstrong.isArmstrong(407));
        assertTrue(Armstrong.isArmstrong(1634));
        
        assertFalse(Armstrong.isArmstrong(381));
        assertFalse(Armstrong.isArmstrong(109));
        assertFalse(Armstrong.isArmstrong(335));
    }
}

