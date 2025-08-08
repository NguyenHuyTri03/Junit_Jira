package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateValidatorTest {

    @Test
    void testValidDate() {
        assertTrue(DateValidator.isValid("2025-08-07", "yyyy-MM-dd"));
    }

    @Test
    void testInvalidDate() {
        assertFalse(DateValidator.isValid("2025-13-40", "yyyy-MM-dd"));
    }
}