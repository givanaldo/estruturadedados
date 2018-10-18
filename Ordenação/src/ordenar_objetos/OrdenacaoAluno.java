package ordenar_objetos;

import java.util.ArrayList;

public class OrdenacaoAluno {

    public static void bubblesort(ArrayList<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (alunos.get(j).compareByNome(alunos.get(j + 1)) > 0) {
                    Aluno aux = alunos.get(j);
                    alunos.set(j, alunos.get(j + 1));
                    alunos.set(j + 1, aux);
                }
            }
        }
    }

    public static void selectionsort(ArrayList<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (alunos.get(i).compareByNome(alunos.get(j)) > 0) {
                    Aluno aux = alunos.get(j);
                    alunos.set(j, alunos.get(i));
                    alunos.set(i, aux);
                }
            }
        }
    }

    public static void insertionsort(ArrayList<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i <= n - 1; i++) {
            Aluno aux = alunos.get(i);
            int j = i - 1;
            while (j >= 0 && aux.compareByNome(alunos.get(j)) < 0) {
                alunos.set(j + 1, alunos.get(j));
                j = j - 1;
            }
            alunos.set(j + 1, aux);
        }
    }

}
