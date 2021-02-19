package ejercicio2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class Ejercicio2Test {

    private int day;
    private String month;
    private int year;
    private int hour;
    private int min;
    private int sec;
    private String exRes;

    public Ejercicio2Test(int day, String month, int year, int hour, int min, int sec, String exRes) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.exRes = exRes;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();

        objects.add(new Object[]{31,"enero",2021,23,59,59,"1 febrero 2021 0:0:0"});
        objects.add(new Object[]{28,"febrero",2000,23,59,59,"29 febrero 2000 0:0:0"});
        objects.add(new Object[]{30,"marzo",2021,23,59,59,"31 marzo 2021 0:0:0"});
        objects.add(new Object[]{30,"abril",2021,23,59,59,"1 mayo 2021 0:0:0"});
        objects.add(new Object[]{1,"mayo",2021,12,59,59,"1 mayo 2021 13:0:0"});
        objects.add(new Object[]{24,"junio",2021,13,59,59,"18 junio 2021 8:22:0"});


        return objects;
    }

    @Test
    public void verify_date() {
        Ejercicio2 ej = new Ejercicio2();
        Assert.assertEquals("ERROR: ", this.exRes, ej.getNextDate(this.day,this.month,this.year,this.hour,this.min,this.sec));
    }
}
