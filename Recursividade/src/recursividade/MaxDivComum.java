package recursividade;

public class MaxDivComum {

    public static int mdcRecursivo(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return mdcRecursivo(n2, n1 % n2);
        }
    }
    
    public static int mdcIterativo(int n1, int n2) {
        int aux;
        while (n2 != 0) {
            aux = n2;
            n2 = n1 % n2;
            n1 = aux;
        }
        return n1;
    }

    public static void main(String[] args) {
        long inicio, fim;
        int n1 = 1478990343;
        int n2 = 911727233;
        
        inicio = System.currentTimeMillis();
        System.out.print("Recursivo MDC(" + n1 + "," + n2 + ") = " + mdcRecursivo(n1, n2));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");
        
        inicio = System.currentTimeMillis();
        System.out.print("Iterativo MDC(" + n1 + "," + n2 + ") = " + mdcIterativo(84032, 11272));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");
    }

}
