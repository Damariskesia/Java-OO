package Application;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ProgramDezoito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate d04 = LocalDate.parse("2024-07-01");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-01T21:45:00");
        Instant d06 = Instant.parse("2024-07-01T22:45:00Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("Semana Passada: " + pastWeekLocalDate);
        System.out.println("Semana que vem: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusHours(24);
        LocalDateTime nextWeekLocalDateTime = d05.plusHours(24);

        System.out.println("Semana Passada: " + pastWeekLocalDateTime);
        System.out.println("Semana que vem: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Semana Passada: " + pastWeekInstant);
        System.out.println("Semana que vem: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
        //atStartOfDay() = atTime(0,0)

        System.out.println("t1 dias = " + t1.toDays());


        sc.close();
    }
}
