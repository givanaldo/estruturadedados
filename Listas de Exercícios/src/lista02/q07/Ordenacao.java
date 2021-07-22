package lista02.q07;

import java.util.ArrayList;

public class Ordenacao {

    public static void insertionsortPorMédia(ArrayList<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i <= n - 1; i++) {
            Aluno aux = alunos.get(i);
            int j = i - 1;
            while (j >= 0 && aux.comparePorMédia(alunos.get(j)) > 0) {
                alunos.set(j + 1, alunos.get(j));
                j = j - 1;
            }
            alunos.set(j + 1, aux);
        }
    }

    public static void insertionsortPorNome(ArrayList<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i <= n - 1; i++) {
            Aluno aux = alunos.get(i);
            int j = i - 1;
            while (j >= 0 && aux.comparePorNome(alunos.get(j)) < 0) {
                alunos.set(j + 1, alunos.get(j));
                j = j - 1;
            }
            alunos.set(j + 1, aux);
        }
    }

}
