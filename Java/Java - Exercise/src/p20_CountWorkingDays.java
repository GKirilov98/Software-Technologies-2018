import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p20_CountWorkingDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String start = input.nextLine();
        String end = input.nextLine();
        LocalDate startDate = LocalDate.parse(start, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate endDate = LocalDate.parse(end, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        int[] holidayDays = {1, 3, 1, 6, 24, 6, 22, 1, 24, 25, 26};
        int[] holidayMonths = {1, 3, 5, 5, 5, 9, 9, 11, 12, 12, 12};
        int count = 0;
        for (LocalDate currentDate = startDate;
             currentDate.isBefore(endDate.plusDays(1));
             currentDate = currentDate.plusDays(1)) {
            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
            int dayAsNum = dayOfWeek.getValue();
            if (dayAsNum == 6 || dayAsNum == 7) {
                continue;
            }

            int month = currentDate.getMonthValue();
            int day = currentDate.getDayOfMonth();

            boolean isHoliday = false;
            for (int i = 0; i < holidayMonths.length; i++) {
                if (month == holidayMonths[i] && day == holidayDays[i]){
                    isHoliday = true;
                    break;
                }
            }

            if (isHoliday){
                continue;
            }

            count++;
        }
        System.out.println(count);
    }
}