package com.schoolofnet.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class DateAPI {
    public static void main(String... args) throws InterruptedException {
        Instant now = Instant.now();
        Thread.sleep(1000);

        Instant now2 = Instant.now();

        Duration dur = Duration.between(now, now2);
        System.out.println(dur.getSeconds());

        LocalDate local = LocalDate.now();
        System.out.println(local);
    }
}
