package com.ss;

import org.junit.Test;

import static com.ss.SumDecomposer.getComponentsTheSum;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for SumDecomposer.
 */
public class SumDecomposerTest {
    /**
     * test GetComponentsTheSum
     */
    @Test
    public void testGetComponentsTheSum() {
        assertArrayEquals(new int[]{-1, 11}, getComponentsTheSum(new int[]{3, 5, -4, 8, 11, -1, 6}, 10));
    }

    @Test
    public void testGetComponentsTheSumInvalidInputs() {
        assertArrayEquals(new int[]{}, getComponentsTheSum(new int[]{1, 1, 4}, 9));

        assertArrayEquals(new int[]{}, getComponentsTheSum(null, 6));

        assertArrayEquals(new int[]{}, getComponentsTheSum(new int[]{1, 1, 4}, 0));

        assertArrayEquals(new int[]{}, getComponentsTheSum(new int[]{5}, 11));
    }
}
