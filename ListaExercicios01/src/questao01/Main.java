package questao01;

public class Main {

    public static void main(String[] args) {
        int[][] dadosA = {{1, 3, 2}, {3, 4, 3}};
        int[][] dadosB = {{8, 4, 1}, {3, 3, 4}, {1, 3, 2}};

        try {
            Matriz mA = new Matriz(dadosA);
            mA.exibeMatriz("Matriz A");
            Matriz mB = new Matriz(dadosB);
            mB.exibeMatriz("Matriz B");
            Matriz mC = mA.multiplicacao(mB);
            mC.exibeMatriz("A * B");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("");
        Matriz ident = Matriz.identidade(5);
        ident.exibeMatriz("Identidade");
    }
}
