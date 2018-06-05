package org.fasttrackit;

import java.time.LocalDateTime;

public class DateUtils {

    public static void main(String[] args) {
        LocalDateTime tomorrow = DateUtils.addDays(1);

        LocalDateTime dayAfterTomorrow = DateUtils.addDays(tomorrow, 1);

        System.out.println(tomorrow);
        System.out.println(dayAfterTomorrow);
    }

    public static LocalDateTime addDays(LocalDateTime initialDate, int days) {
        return initialDate.plusDays(days);
    }

    public static LocalDateTime addDays(int days) {
        return LocalDateTime.now().plusDays(days);
    }
}
