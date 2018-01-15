public class PruebasConWhile {

    /**
     * 4.30
     */
    public void multiplosDe5() {
        int indice = 10;
        System.out.println("Todos los multiplos de 5 comprendidos entre 10 y 95 son:");

        while(indice <= 95) {
            System.out.println(indice);
            indice += 5;
        }
    }

    /**
     * 4.31
     */
    public void sumaEntreLosNumeros_1y10() {
        int indice = 1;
        int suma = 0;

        while(indice <= 10) {
            suma += indice;
            indice += 1;
        }

        System.out.println("La suma de los numeros comprendidos entre 1 y 10 es: ->" + suma);
    }

    /**
     * 4.32
     */
    public void sum(int a, int b) {
        int suma = 0;
        int contador = 0;

        while(a <= b) {
            suma += a;
            a += 1;
            contador += 1;
        }

        System.out.println("La suma de todos los numeros comprendidos entre -> " + (a - contador) + " Y " + b + " Es: " + suma);        
    }

    /**
     * 4.33
     */
    public boolean isPrime(int n) {
        boolean numerosPrimos = true;
        int indice = 2;

        while(indice < n && numerosPrimos == true) {
            if(n % indice == 0) {
                numerosPrimos = false;
            }
            indice += 1;
        }

        return numerosPrimos;
    }
}