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

        objects.add(new Object[]{1, "Enero", 2020,  23, 59, 59, "2 enero 2020 0:0:0"});
        objects.add(new Object[]{1, "Febrero", 2020,  23, 59, 59, "2 febrero 2020 0:0:0"});
        objects.add(new Object[]{1, "Marzo", 2020,  23, 59, 59, "2 marzo 2020 0:0:0"});
        objects.add(new Object[]{1, "Abril", 2020,  23, 59, 59, "2 abril 2020 0:0:0"});
        objects.add(new Object[]{1, "Mayo", 2020,  23, 59, 59, "2 mayo 2020 0:0:0"});
        objects.add(new Object[]{1, "Junio", 2020,  23, 59, 59, "2 junio 2020 0:0:0"});
        objects.add(new Object[]{1, "Julio", 2020,  23, 59, 59, "2 julio 2020 0:0:0"});
        objects.add(new Object[]{1, "Agosto", 2020,  23, 59, 59, "2 agosto 2020 0:0:0"});
        objects.add(new Object[]{1, "Septiembre", 2020,  23, 59, 59, "2 septiembre 2020 0:0:0"});
        objects.add(new Object[]{1, "Octubre", 2020,  23, 59, 59, "2 octubre 2020 0:0:0"});
        objects.add(new Object[]{1, "Noviembre", 2020,  23, 59, 59, "2 noviembre 2020 0:0:0"});
        objects.add(new Object[]{1, "Diciembre", 2020,  23, 59, 59, "2 diciembre 2020 0:0:0"});
        objects.add(new Object[]{31, "Enero", 2020,  23, 59, 59, "1 febrero 2020 0:0:0"});
        objects.add(new Object[]{28, "Febrero", 2021,  23, 59, 59, "1 marzo 2021 0:0:0"});
        objects.add(new Object[]{29, "Febrero", 2020,  23, 59, 59, "1 marzo 2020 0:0:0"});
        objects.add(new Object[]{31, "Marzo", 2020,  23, 59, 59, "1 abril 2020 0:0:0"});
        objects.add(new Object[]{30, "Abril", 2020,  23, 59, 59, "1 mayo 2020 0:0:0"});
        objects.add(new Object[]{31, "Mayo", 2020,  23, 59, 59, "1 junio 2020 0:0:0"});
        objects.add(new Object[]{30, "Junio", 2020,  23, 59, 59, "1 julio 2020 0:0:0"});
        objects.add(new Object[]{31, "Julio", 2020,  23, 59, 59, "1 agosto 2020 0:0:0"});
        objects.add(new Object[]{31, "Agosto", 2020,  23, 59, 59, "1 septiembre 2020 0:0:0"});
        objects.add(new Object[]{30, "Septiembre", 2020,  23, 59, 59, "1 octubre 2020 0:0:0"});
        objects.add(new Object[]{31, "Octubre", 2020,  23, 59, 59, "1 noviembre 2020 0:0:0"});
        objects.add(new Object[]{30, "Noviembre", 2020,  23, 59, 59, "1 diciembre 2020 0:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 23, 59, 59, "1 enero 2021 0:0:0"});

        objects.add(new Object[]{20, "Febrero", -1, 23, 59, 59, "Parametro incorrecto"});
        objects.add(new Object[]{31, "Febrero", 2020, 23, 59, 59, "Parametro incorrecto"});
        objects.add(new Object[]{31, "Diciembres", 2020, 23, 59, 59, "Parametro incorrecto"});

        objects.add(new Object[]{31, "Diciembre", 2020, -1, 59, 59, "Parametro incorrecto"});
        objects.add(new Object[]{31, "Diciembre", 2020, 0, 59, 59, "31 diciembre 2020 1:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 59, 59, "31 diciembre 2020 2:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 11, 59, 59, "31 diciembre 2020 12:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 12, 59, 59, "31 diciembre 2020 13:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 13, 59, 59, "31 diciembre 2020 14:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 22, 59, 59, "31 diciembre 2020 23:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 23, 59, 59, "1 enero 2021 0:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 24, 59, 59, "Parametro incorrecto"});

        objects.add(new Object[]{31, "Diciembre", 2020, 1, -1, 59, "Parametro incorrecto"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 0, 59, "31 diciembre 2020 1:1:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 59, "31 diciembre 2020 1:2:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 29, 59, "31 diciembre 2020 1:30:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 30, 59, "31 diciembre 2020 1:31:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 31, 59, "31 diciembre 2020 1:32:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 58, 59, "31 diciembre 2020 1:59:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 59, 59, "31 diciembre 2020 2:0:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 60, 59, "Parametro incorrecto"});

        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, -1, "Parametro incorrecto"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 0, "31 diciembre 2020 1:1:1"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 1, "31 diciembre 2020 1:1:2"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 29, "31 diciembre 2020 1:1:30"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 30, "31 diciembre 2020 1:1:31"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 31, "31 diciembre 2020 1:1:32"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 58, "31 diciembre 2020 1:1:59"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 59, "31 diciembre 2020 1:2:0"});
        objects.add(new Object[]{31, "Diciembre", 2020, 1, 1, 60, "Parametro incorrecto"});

        objects.add(new Object[]{39, "Dragon", -1000, 25, 69, 80, "Parametro incorrecto"});


        return objects;
    }

    @Test
    public void verify_date() {
        Ejercicio2 ej = new Ejercicio2();
        Assert.assertEquals("ERROR: ", this.exRes, ej.getNextDate(this.day,this.month,this.year,this.hour,this.min,this.sec));
    }
}
