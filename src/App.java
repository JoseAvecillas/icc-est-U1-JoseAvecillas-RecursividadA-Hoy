public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        

        // int n = 5;
        // int resultadoFinal= factorial(n);
        // System.out.println("Resultado:" + resultadoFinal);

         EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();

        // int fibo = ejercicios.fibonacci(5);
        // System.out.println("Fibonacci: " + fibo);

        // int suma = ejercicios.sumaConsecutivos(5);
        // System.out.println("Suma de consecutivos hasta 5: " + suma);

        // int potencia = ejercicios.getPotencial(3, 5);
        // System.out.println("La potencia es: "+ potencia);

        int sumadigitos= ejercicios.sumaDigitos(12);
        System.out.println("El resultado es: " + sumadigitos);
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
