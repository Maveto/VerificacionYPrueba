package calculadoraTest;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RestaTest {

    Calculadora cal;

    @Before
    public void before(){
        cal = new Calculadora();
    }

    @Test
    public void restarPares(){
        int actRes = cal.restar(4, 2);
        int expRes = 2;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }

    @Test
    public void restarImpares(){
        int actRes = cal.restar(5, 3);
        int expRes = 2;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }

    @Test
    public void restarImparesPares(){
        int actRes = cal.restar(4, 7);
        int expRes = -3;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }
}
