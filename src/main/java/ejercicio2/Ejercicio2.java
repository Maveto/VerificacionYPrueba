package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public String getNextDate(int day, String month, int year, int hour, int min, int sec) {
        String msg;
        List<String> months = new ArrayList<>();
        months.add("enero");
        months.add("febrero");
        months.add("marzo");
        months.add("abril");
        months.add("mayo");
        months.add("junio");
        months.add("julio");
        months.add("agosto");
        months.add("septiembre");
        months.add("octubre");
        months.add("noviembre");
        months.add("diciembre");

        System.out.println(months.contains(month));
        if (day<31 && months.contains(month) && year>0 && hour<24 && min<60 && sec<60) {
            if (sec == 59) {
                msg = day + " " + month + " " + year + " " + hour + ":" + (min + 1) + ":" + 0;
            } else {
                msg = day + " " + month + " " + year + " " + hour + ":" + min + ":" + (sec + 1);
            }
        } else {
            msg = "Parametro incorrecto";
        }

        return msg;
    }
}
