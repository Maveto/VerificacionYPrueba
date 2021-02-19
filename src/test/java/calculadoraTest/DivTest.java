package calculadoraTest;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivTest {

    Calculadora cal;

    @Before
    public void before(){
        cal = new Calculadora();
    }

    @Test
    public void divPares(){
        int actRes = cal.div(4, 2);
        int expRes = 2;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }

    @Test
    public void divImpares(){
        int actRes = cal.div(5, 3);
        int expRes = 1;
        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }

    @Test(expected = ArithmeticException.class)
    public void divImparesPares(){
        int actRes = cal.div(9, 0);
//        int expRes = 0;
//        Assert.assertEquals("ERROR! La suma es incorrecta", expRes, actRes);
    }
}
