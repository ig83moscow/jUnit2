package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TriangleTest {

    @Test
    public void rigorousTest() {
        assertTrue(true);
    }

    @Test
    void trueAssumption() {
        assumeTrue(5 + 7 > 9);
        assumeEquals(5 + 7, 12);
    }

    private void assumeEquals(int i, int i1) {
    }

    @Test
    void falseAssumption() {
        assumeFalse(12 < 9);
        asserEquals(5 + 7, 12);
    }

    private void asserEquals(int i, int i1) {
    }

    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
            throw new UnsupportedOperationException("Not supported");
        });
        assertEquals(exception.getMessage(), "Not supported");
    }

}
