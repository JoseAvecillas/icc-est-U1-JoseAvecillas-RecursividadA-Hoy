public class EjerciciosRecursivos {

    public int fibonacci(int n){
        if (n<=1) {
            return n;
        }
        return fibonacci(n -1) + fibonacci(n -2);

    }

    // Metodo que devuelve la suma de los numeros que contiene n para. Donde n= 5 n numero a ser sumado rettorna cada suma para n= 5 retorna 5
    public int sumaConsecutivos(int n){
        if(n==1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado= n + resultadoParcial;
        return resultado;
    }
}