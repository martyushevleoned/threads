package org.example.values;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicValueStorage {

    static AtomicInteger value = new AtomicInteger(0);

    public static void incrementValue() {
        value.incrementAndGet();
    }

    public static int getValue() {
        return value.intValue();
    }
}
