import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) {

        DateFormat format = new SimpleDateFormat("hh:mm dd.MM.yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}