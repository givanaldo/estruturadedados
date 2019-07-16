package q1_repo;

public class Maximo {

    public static int maximo(int v[], int n) {
        
        if (n == 1)
            return v[0];
        else {
            int x = maximo(v, n-1);
            if (x > v[n-1])
                return x;
            else
                return v[n-1];
        }
    }

    public static void main(String[] args) {
        int vetor[] = {2, 109, 231, 4, 3, 12};
        System.out.println("Máximo = " + maximo(vetor, vetor.length));
    }

}
