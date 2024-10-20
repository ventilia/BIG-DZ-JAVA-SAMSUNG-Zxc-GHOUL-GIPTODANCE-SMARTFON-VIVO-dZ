import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String data = scanner.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M yyyy");
        try {
            LocalDate date = LocalDate.parse(data, formatter);


            String res = date.format(DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH));
            System.out.println(res);
        } catch (DateTimeParseException e) {
            return;
        }

    }
}
//код выглядит страшно и не понятно. я знаю.
//это задание было у нас на прошлом на курсе. у нас была тема с работой над датами.
//ссылки на библиотеки с которыми я работал https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
// этого в коде не было, но тож на всякий https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
//локаль тут нужно для перевода с ру на англ.
//такую сказку гпт бы не придумал точно.







//офигеть, оказываеца нельзя так решать...
