import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, 1, 10);

        LocalDateTime now = LocalDateTime.now();

        Period period = Period.between(birthday, now.toLocalDate());
        Duration duration = Duration.between(birthday.atStartOfDay(), now);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        int hours = (int) duration.toHours();
        int minutes = (int) duration.toMinutes() % 60;
        int seconds = (int) duration.getSeconds() % 60;

        System.out.println("Вам виповнилося " + years + " років, " + months + " місяців, " + days + " днів, " + hours + " годин, " + minutes + " хвилин та " + seconds + " секунд.");
    }
}