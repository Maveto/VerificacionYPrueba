package basicJunit;

import org.junit.*;

public class BasicJunit1 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("************BEFORE CLASS METHOD");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("************AFTER CLASS METHOD");
    }

    //initialize
    //setup
    @Before
    public void before(){
        System.out.println("--------->BEFORE METHOD");
    }

    //cleanup
    //teardown
    @After
    public void after(){
        System.out.println("--------->AFTER METHOD");
    }

    @Test
    public void verify_something(){
        System.out.println("LOGICA DEL TEST");
    }

    @Test
    public void verify_something2(){
        System.out.println("LOGICA DEL TEST 2");
    }

    @Test
    @Ignore
    public void verify_something3(){
        System.out.println("LOGICA DEL TEST 3");
    }

    @Test(timeout = 2000)
    public void verify_something4(){
        System.out.println("LOGICA DEL TEST 4 - SPEED TEST");
    }

    @Test(expected = ArithmeticException.class)
    @Ignore
    public void verify_something5(){
        System.out.println("LOGICA DEL TEST 5 - EXCEPCION");
    }
}
