package mdc;

public class Main {

    public static void main(String[] args) {
        long inicio, fim;
        int n1 = 1478990343;
        int n2 = 9727233;
        
        inicio = System.currentTimeMillis();
        System.out.print("Recursivo MDC(" + n1 + "," + n2 + ") = " + MDC.mdcRecursivo(n1, n2));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");
        
        inicio = System.currentTimeMillis();
        System.out.print("Iterativo MDC(" + n1 + "," + n2 + ") = " + MDC.mdcIterativo(n1, n2));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");
    }

}
