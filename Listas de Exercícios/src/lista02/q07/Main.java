package lista02.q07;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos1 = new ArrayList<>();

        alunos1.add(new Aluno("202012332", "Monic", 28));
        alunos1.add(new Aluno("202012309", "Matheus", 70));
        alunos1.add(new Aluno("202012390", "Roberta", 45));
        alunos1.add(new Aluno("201912345", "Pablo", 58));
        alunos1.add(new Aluno("202178345", "Bruno", 67));
        alunos1.add(new Aluno("202012321", "Soraya", 40));
        alunos1.add(new Aluno("202011235", "Carlos", 85));
        alunos1.add(new Aluno("201924345", "Juliana", 100));
        alunos1.add(new Aluno("202043349", "Júlia", 62));
        alunos1.add(new Aluno("202012143", "Bruna", 98));
        
        ArrayList<Aluno> alunos2 = new ArrayList<>(alunos1);
        ArrayList<Aluno> alunos3 = new ArrayList<>(alunos1);

        System.out.println(alunos1.size() + " alunos.");

        Ordenacao.insertionsortPorMédia(alunos1);
        Ordenacao.insertionsortPorNome(alunos2);
        
        Collections.sort(alunos3, new SortByMédia());

        listar(alunos1, "Alunos ordenados por média");
        listar(alunos2, "Alunos ordenados por nome");
        listar(alunos3, "Alunos ordenados por nome (Collections)");

    }

    public static void listar(ArrayList<Aluno> alunos, String titulo) {
        System.out.printf("\n*** %s ***\n", titulo);
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println();
    }
}
