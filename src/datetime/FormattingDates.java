package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDates {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        String formattedDate1 = DateTimeFormatter.ISO_LOCAL_DATE.format(ldt1);
        String formattedDate2 = DateTimeFormatter.BASIC_ISO_DATE.format(ldt1);
        System.out.println(formattedDate1);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(dtf.format(ldt1));

        String formatStyleDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt1);
        System.out.println(formatStyleDate);
    }
}
