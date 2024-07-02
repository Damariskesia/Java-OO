
package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramDezessete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        LocalDate date2 = LocalDate.parse("2024-07-01");
        System.out.println(date2);

        LocalDateTime dateTime2 = LocalDateTime.parse("2024-07-01T18:45:00");
        System.out.println(dateTime2);

        Instant instant2 = Instant.parse("2024-07-01T18:45:00Z");
        System.out.println(instant2);

        Instant instant3 = Instant.parse("2024-07-01T18:52:26-03:00");
        System.out.println(instant3);

        LocalDate date3 = LocalDate.parse("01/07/2024", dtf);
        System.out.println(date3);

        LocalDateTime dateTime3 = LocalDateTime.parse("01/07/2024 18:45:15", dtf2);
        System.out.println(dateTime3);

        LocalDate date4 = LocalDate.of(2024, 7, 1);
        System.out.println(date4);

        LocalDateTime dateTime4 = LocalDateTime.of(2024, 7, 1, 18, 45, 15);
        System.out.println(dateTime4);

        System.out.println("Format zone:" + dtf3.format(instant));

        System.out.println("Dia:" + date2.getDayOfMonth());
        System.out.println("Mês:" + date2.getMonthValue());
        System.out.println("Ano:" + date2.getYear());

        sc.close();
    }
}
