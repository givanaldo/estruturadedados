package ordenar_objetos;

import java.util.ArrayList;
import java.util.Collections;

public class TesteOrdenacaoAluno {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos1 = new ArrayList<>();

        alunos1.add(new Aluno("Monic", "TSI"));
        alunos1.add(new Aluno("Matheus", "TSI"));
        alunos1.add(new Aluno("Roberta", "Informática"));
        alunos1.add(new Aluno("Pablo", "Informática"));
        alunos1.add(new Aluno("Bruno", "Informática"));
        alunos1.add(new Aluno("Soraya", "Informática"));
        alunos1.add(new Aluno("Carlos", "TSI"));
        alunos1.add(new Aluno("Juliana", "TSI"));
        alunos1.add(new Aluno("Júlia", "Informática"));
        alunos1.add(new Aluno("Cláudio", "TSI"));
        alunos1.add(new Aluno("José", "TSI"));
        alunos1.add(new Aluno("Caio", "TSI"));
        alunos1.add(new Aluno("Monic", "Mecatrônica"));
        alunos1.add(new Aluno("Francisco", "Informática"));
        alunos1.add(new Aluno("Alberto", "Informática"));
        alunos1.add(new Aluno("João", "Informática"));
        alunos1.add(new Aluno("Gilmar", "Informática"));
        alunos1.add(new Aluno("Xavier", "Informática"));
        alunos1.add(new Aluno("Juliana", "Informática"));
        alunos1.add(new Aluno("Vinicius", "Informática"));
        alunos1.add(new Aluno("Jessica", "Informática"));
        alunos1.add(new Aluno("Alane", "Informática"));
        alunos1.add(new Aluno("Monic", "Informática"));
        alunos1.add(new Aluno("Brenda", "Informática"));
        alunos1.add(new Aluno("Bruna", "Informática"));
        alunos1.add(new Aluno("Allef", "Informática"));
        alunos1.add(new Aluno("Robson", "Informática"));
        alunos1.add(new Aluno("Aline", "Informática"));
        alunos1.add(new Aluno("Manuela", "Informática"));
        alunos1.add(new Aluno("Ilane", "Informática"));
        alunos1.add(new Aluno("Jobson", "Informática"));
        alunos1.add(new Aluno("Abraão", "Informática"));
        alunos1.add(new Aluno("Isac", "Informática"));
        alunos1.add(new Aluno("Jorge", "TSI"));
        alunos1.add(new Aluno("Rômulo", "Informática"));

        ArrayList<Aluno> alunos2 = new ArrayList<>(alunos1);
        ArrayList<Aluno> alunos3 = new ArrayList<>(alunos1);
        ArrayList<Aluno> alunos4 = new ArrayList<>(alunos1);

        System.out.println(alunos1.size() + " alunos.");

        long inicio = System.currentTimeMillis();
        OrdenacaoAluno.bubblesort(alunos1);
        long fim = System.currentTimeMillis();
        System.out.println("Bubblesort: " + (fim - inicio) + " milisegundos");

        inicio = System.currentTimeMillis();
        OrdenacaoAluno.selectionsort(alunos2);
        fim = System.currentTimeMillis();
        System.out.println("Selectionsort: " + (fim - inicio) + " milisegundos");

        inicio = System.currentTimeMillis();
        OrdenacaoAluno.insertionsort(alunos3);
        fim = System.currentTimeMillis();
        System.out.println("Insertionsort: " + (fim - inicio) + " milisegundos");

        inicio = System.currentTimeMillis();
        Collections.sort(alunos4, new SortByName());
        fim = System.currentTimeMillis();
        System.out.println("Collections.sort: " + (fim - inicio) + " milisegundos");

        listar(alunos1);

    }

    public static void listar(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println();
    }
}
