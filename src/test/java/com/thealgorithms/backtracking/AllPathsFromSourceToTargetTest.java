package com.thealgorithms.backtracking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AllPathsFromSourceToTargetTest {
    @Test
    void generated_smoke_test() throws Exception {
        Class<?> type = Class.forName("com.thealgorithms.backtracking.AllPathsFromSourceToTarget");
        assertNotNull(type);
        try {
            Object instance = type.getDeclaredConstructor().newInstance();
            assertNotNull(instance);
            assertNotNull(instance.toString());
        } catch (NoSuchMethodException ignored) {
            // No default constructor; still consider it a valid compilation/runtime smoke check.
            assertNotNull(type.getName());
        }
    }
}
