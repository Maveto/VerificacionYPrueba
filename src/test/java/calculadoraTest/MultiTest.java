package calculadoraTest;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiTest {

    Calculadora cal;

    @Before
    public void before(){
        cal = new Calculadora();
    }

    @Test
    public void multPares() throws InterruptedException {
        int actRes = cal.mult(4, 2);
        int expRes = 8;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }

    @Test
    public void multImpares() throws InterruptedException {
        int actRes = cal.mult(5, 3);
        int expRes = 15;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }

    @Test(timeout = 2000)
    public void multImparesPares() throws InterruptedException {
        int actRes = cal.mult(4, 7);
        int expRes = 28;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }
}
