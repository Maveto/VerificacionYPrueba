package calculadoraTest;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumaTest {

    Calculadora cal;

    @Before
    public void before(){
        cal = new Calculadora();
    }

    @Test
    public void sumarPares(){
        int actRes = cal.sumar(4, 2);
        int expRes = 6;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }

    @Test
    public void sumarImpares(){
        int actRes = cal.sumar(5, 3);
        int expRes = 8;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }

    @Test
    public void sumarImparesPares(){
        int actRes = cal.sumar(4, 7);
        int expRes = 11;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }
}
