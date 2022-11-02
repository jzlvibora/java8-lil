package datetime;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ChangingDatesAndTimes {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();

        //plus and ,imus methods
        LocalDateTime ldt2 = ldt1.plusDays(7);
        LocalDateTime ldt3 = ldt1.plusMinutes(7);
        System.out.println(ldt2);
        LocalDateTime ldt2a = ldt1.plus(Period.ofWeeks(1));
        System.out.println(ldt2a);
//        LocalDateTime ldt2b = ldt1.minus(Duration.ofHours(12));

        //with methods
        LocalDateTime ldt4 = ldt1.withMonth(9);
        System.out.println(ldt4);
    }


}
