public class operacion {

    public int suma(int a, int b) {

        if (a<0 || b<0) {
            System.out.println("No se puede sumar numeros negativos");
            return -1;
        }
        return a + b;
    }

    public double suma(double a, double b) {
        return a + b;
    }

    public int suma(int a, int b, int c) {
        return a + b + c;
    }
    
    public void recursiva(int numero) {
        if (numero > 0) {
            if ( numero % 2 == 0) {
               
            } else if (numero % 2 != 0) {
                System.out.println(numero + " es impar");
            }
            recursiva(numero - 1 );
        }
    }

}
