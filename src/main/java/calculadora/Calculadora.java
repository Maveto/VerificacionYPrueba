package calculadora;

public class Calculadora {

    public Calculadora(){

    }

    public int sumar(int a, int b){return a+b;}

    public int restar(int a, int b){return a-b;}

    public int mult(int a, int b) throws InterruptedException {
        Thread.sleep(1500);
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }
}
