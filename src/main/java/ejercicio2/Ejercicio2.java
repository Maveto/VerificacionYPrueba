package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Ejercicio2 {

    public String getNextDate(int day, String month, int year, int hour, int min, int sec) {
        String msg = "";
        String mon = month.toLowerCase();
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

        if (day<32 && day>0 && months.contains(month.toLowerCase()) && year>0 && hour<24 && hour>=0 && min<60 && min>=0 && sec<60 && sec>=0) {
            if (sec == 59) {
                if (min == 59){
                    if (hour == 23){
                        switch (month.toLowerCase()){
                            case "enero":
                                if (day == 31){
                                    msg = 1 + " febrero " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "febrero":
                                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                                    if (day > 29){
                                        msg = "Parametro incorrecto";
                                    }else if (day == 29){
                                        msg = 1 + " marzo " + year + " " + 0 + ":" + 0 + ":" + 0;
                                    }else {
                                        msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                    }
                                }else {
                                    if (day > 28){
                                        msg = "Parametro incorrecto";
                                    }else if (day == 28){
                                        msg = 1 + " marzo " + year + " " + 0 + ":" + 0 + ":" + 0;
                                    }else {
                                        msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                    }
                                }
                                break;
                            case "marzo":
                                if (day == 31){
                                    msg = 1 + " abril " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "abril":
                                if (day == 30){
                                    msg = 1 + " mayo " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "mayo":
                                if (day == 31){
                                    msg = 1 + " junio " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "junio":
                                if (day == 30){
                                    msg = 1 + " julio " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "julio":
                                if (day == 31){
                                    msg = 1 + " agosto " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "agosto":
                                if (day == 31){
                                    msg = 1 + " septiembre " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "septiembre":
                                if (day == 30){
                                    msg = 1 + " octubre " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "octubre":
                                if (day == 31){
                                    msg = 1 + " noviembre " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "noviembre":
                                if (day == 30){
                                    msg = 1 + " diciembre " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                            case "diciembre":
                                if (day == 31){
                                    msg = 1 + " enero " + (year+1) + " " + 0 + ":" + 0 + ":" + 0;
                                }else {
                                    msg = (day+1) + " " + mon + " " + year + " " + 0 + ":" + 0 + ":" + 0;
                                }
                                break;
                        }
                    } else {
                        msg = day + " " + mon + " " + year + " " + (hour+1) + ":" + 0 + ":" + 0;
                    }
                } else {
                    msg = day + " " + mon + " " + year + " " + hour + ":" + (min + 1) + ":" + 0;
                }
            } else {
                msg = day + " " + mon + " " + year + " " + hour + ":" + min + ":" + (sec + 1);
            }
        } else {
            msg = "Parametro incorrecto";
        }

        return msg;
    }
}
