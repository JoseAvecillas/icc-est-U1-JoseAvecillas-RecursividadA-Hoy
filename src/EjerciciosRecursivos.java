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

    //*Escribe una funcon recursiva que calcule la potencia 
    //*De un numero base elevado a un expontete entero expotente.
    //*Por ejemplo, si base de 2 y exponente es 3.
    //*La funcion a devolver seria 2 elevada a la 3= 8
    //*

    public int getPotencial(int base, int exponente){
        if(base==0){
            return 1;
        }
        if (exponente==0) {
            return 1;
        }
        int resultado= base*getPotencial(base, exponente-1);
        return resultado;
    }

    //Un numero es menor que 10 lo cual signica que solo tiene un digito, se devuelve el mismo numero.
    //En caso contrario se extra el ultimo digito utilizando el operador modulo % y se calcula el los digitos menos el
    //Ultimo utilizando la division entera /10. Luego se realiza una llamada recusriva a sumaDigitos con el resto y 
    //se suma el ultimo digito
    
    public int sumaDigitos(int n) {
        if (n < 10) {
            return n; 
        }
        int ultimoDigito = n % 10; 
        int restoDelNumero = n / 10; 
        return ultimoDigito + sumaDigitos(restoDelNumero);
    }

    public String numerosImpresos(int n) {
        if (n <= 0) {
            return "";
        }
        return n + (n == 1 ? "" : " ") + numerosImpresos(n - 1);
    }

    public int Reverso(int n) {
        return Reverso(n, 0);
    }

    private int Reverso(int n, int invertido) {
        if (n == 0) {
            return invertido;
        }
        return Reverso(n / 10, invertido * 10 + n % 10);
    }
}

