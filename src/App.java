public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();

        // FACTORIAL
        int n = 5;
        int resultadoFinal= factorial(n);
        System.out.println("Resultado:" + resultadoFinal);

        // FIBONACCI
        int fibo = ejercicios.fibonacci(5);
        System.out.println("Fibonacci: " + fibo);

        // SUMA CONSECUTIVOS
        int suma = ejercicios.sumaConsecutivos(5);
        System.out.println("Suma de consecutivos hasta 5: " + suma);

        // POTENCIAL
        int potencia = ejercicios.getPotencial(3, 5);
        System.out.println("La potencia es: "+ potencia);

        // SUMA DIGITOS 
        int sumadigitos= ejercicios.sumaDigitos(12);
        System.out.println("El resultado es: " + sumadigitos);

        // NUMEROS HASTA 1 
        String numeroshasta1 = ejercicios.numerosImpresos(12);
        System.out.println("El resultado será: " + numeroshasta1);

        // REVERSO DEL NUMERO
        int Reversonumeros= ejercicios.Reverso(12);
        System.out.println("El reverso es:" +Reversonumeros);
    }

    public static int factorial(int n){
        if(n==0){
            System.out.println("Alcanzar el caso base");
            return 1;
        }
        int resultado= n+ factorial(n-1);
        System.out.println("Calculando factorial de:"+ n + " * factorial("+(n-1)+ " -1)");
        return resultado;
    }
}
