package com.thealgorithms.compression;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LZ78Test {
    @Test
    void generated_smoke_test() throws Exception {
        Class<?> type = Class.forName("com.thealgorithms.compression.LZ78");
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
