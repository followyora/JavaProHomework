import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        LocalDate[] dates = new LocalDate[8];


        dates[0] = LocalDate.of(2023, 1, 1);
        dates[1] = LocalDate.of(2023, 2, 4);
        dates[2] = LocalDate.of(2023, 3, 10);
        dates[3] = LocalDate.of(2023, 4, 5);
        dates[4] = LocalDate.of(2023, 5, 9);
        dates[5] = LocalDate.of(2023, 6, 24);
        dates[6] = LocalDate.of(2023, 7, 11);
        dates[7] = LocalDate.of(2023, 8, 2);


        Arrays.sort(dates, Comparator.comparing(LocalDate::getYear));
        Arrays.sort(dates, Comparator.comparing(LocalDate::getDayOfMonth));


        for (LocalDate date : dates) {
            System.out.println(date);
        }
    }
}
