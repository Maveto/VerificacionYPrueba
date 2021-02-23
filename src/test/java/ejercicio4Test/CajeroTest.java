package ejercicio4Test;

import ejercicio4.BDUtil;
import ejercicio4.Cajero;
import ejercicio4.ClientDB;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CajeroTest {

    private int ci;
    private int amount;
    private boolean exDbUtil;
    private boolean exClienteDb;
    private int saldo;
    private String expRes;

    public CajeroTest(int ci, int amount, boolean exDbUtil, boolean exClienteDb, int saldo, String expRes){
        this.ci = ci;
        this.amount = amount;
        this.exDbUtil = exDbUtil;
        this.exClienteDb = exClienteDb;
        this.saldo = saldo;
        this.expRes = expRes;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects = new ArrayList<>();

        objects.add(new Object[]{99898, -1, true, true, 5000, "Amount No Valido"});
        objects.add(new Object[]{99898, 0, true, true, 5000, "Amount No Valido"});
        objects.add(new Object[]{99898, 1, true, true, 5000, "Usted esta sacando la cantidad de 1 y tiene en saldo 4999"});
        objects.add(new Object[]{99898, 4999, true, true, 5000, "Usted esta sacando la cantidad de 4999 y tiene en saldo 1"});
        objects.add(new Object[]{99898, 5000, true, true, 5000, "Usted esta sacando la cantidad de 5000 y tiene en saldo 0"});
        objects.add(new Object[]{99898, 5001, true, true, 5000, "Usted no tiene suficiente saldo"});

        objects.add(new Object[]{99898, 1, false, true, 5000, "Actualizacion Incorrecta, Intente Nuevamente"});

        objects.add(new Object[]{99898, 1, true, false, 5000, "Conexion a BD no fue satisfactoria"});

        objects.add(new Object[]{99898, 1, true, true, -1, "Saldo Invalido"});



        return objects;
    }

    //PASO 2
    BDUtil bdUtilMocked = Mockito.mock(BDUtil.class);
    ClientDB clientDBMocked = Mockito.mock(ClientDB.class);

    @Test
    public void verify_get_cash(){
        Cajero cajero = new Cajero(this.saldo,bdUtilMocked,clientDBMocked);

        //PASO 3
        Mockito.when(bdUtilMocked.updateSaldo(this.ci,this.saldo-this.amount)).thenReturn(this.exDbUtil);
        Mockito.when(clientDBMocked.isConnectionSuccessfully("mysql")).thenReturn(this.exClienteDb);

        //PASO 4
        Assert.assertEquals("ERROR: ", expRes, cajero.getCash(this.ci, this.amount));

    }
}
