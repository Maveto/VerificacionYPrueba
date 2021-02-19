package badPractices;

public class Calculadora {

    public Calculadora(){

    }

    public int sumar(int a, int b){
        return a+b;
    }

    /*
    *NO ES CORRECTO!! no se debe probar de esta manera
     */
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        int actualResult = cal.sumar(5,5);
        int expectedResult = 10;

        if(actualResult == expectedResult){
            System.out.println("Funciona");
        }else {
            System.out.println("No Funciona");
        }
    }
}
