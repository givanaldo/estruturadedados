package mdc;

public class MDC {

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
}
