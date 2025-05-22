public class Main {

     public static void main(String[] args) {
        operacion op = new operacion();
        System.out.println("Suma de 2 enteros: " + op.suma(5, 10));
        System.out.println("Suma de 3 enteros: " + op.suma(5, 10, 15));
        System.out.println("Suma de 2 decimales: " + op.suma(5.5, 10.5));

        op.recursiva(5);   // Imprime los números pares de 5 a 1
        
        
    }

}
