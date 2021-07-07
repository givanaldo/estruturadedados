package objetos;

import java.util.ArrayList;
import java.util.Collections;

public class TesteOrdenacaoAluno {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos1 = new ArrayList<>();

        alunos1.add(new Aluno("Monic", "TSI", 18));
        alunos1.add(new Aluno("Matheus", "TSI", 17));
        alunos1.add(new Aluno("Roberta", "Informática", 14));
        alunos1.add(new Aluno("Pablo", "Informática", 15));
        alunos1.add(new Aluno("Bruno", "Informática", 16));
        alunos1.add(new Aluno("Soraya", "Informática", 14));
        alunos1.add(new Aluno("Carlos", "TSI", 18));
        alunos1.add(new Aluno("Juliana", "TSI", 20));
        alunos1.add(new Aluno("Júlia", "Informática", 16));
        alunos1.add(new Aluno("Cláudio", "TSI", 19));
        alunos1.add(new Aluno("José", "TSI", 20));
        alunos1.add(new Aluno("Caio", "TSI", 21));
        alunos1.add(new Aluno("Monic", "Mecatrônica", 14));
        alunos1.add(new Aluno("Francisco", "Informática", 14));
        alunos1.add(new Aluno("Alberto", "Informática", 15));
        alunos1.add(new Aluno("João", "Informática", 15));
        alunos1.add(new Aluno("Gilmar", "Informática", 15));
        alunos1.add(new Aluno("Xavier", "Informática", 13));
        alunos1.add(new Aluno("Juliana", "Informática", 14));
        alunos1.add(new Aluno("Vinicius", "Informática", 15));
        alunos1.add(new Aluno("Jessica", "Informática", 14));
        alunos1.add(new Aluno("Alane", "Informática", 18));
        alunos1.add(new Aluno("Monic", "Informática", 13));
        alunos1.add(new Aluno("Brenda", "Informática", 14));
        alunos1.add(new Aluno("Bruna", "Informática", 18));
        alunos1.add(new Aluno("Allef", "Informática", 15));
        alunos1.add(new Aluno("Robson", "Informática", 15));
        alunos1.add(new Aluno("Aline", "Informática", 14));
        alunos1.add(new Aluno("Manuela", "Informática", 13));
        alunos1.add(new Aluno("Ilane", "Informática", 15));
        alunos1.add(new Aluno("Jobson", "Informática", 16));
        alunos1.add(new Aluno("Abraão", "Informática", 16));
        alunos1.add(new Aluno("Isac", "Informática", 18));
        alunos1.add(new Aluno("Jorge", "TSI", 23));
        alunos1.add(new Aluno("Rômulo", "Informática", 14));

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
        Collections.sort(alunos4, new SortByCurso());
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
