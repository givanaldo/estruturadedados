package exemplos;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        byte numero = 120;
        double numeroDecimal = 10.5;
        String nomeCandidato = "";
        System.out.println(numeroDecimal);

        
        int idade = 18;
        if (idade < 18) {
            System.out.println("Menor de idade");
            System.out.println("Escapou de ser preso");
        } else if (idade == 18) {
            System.out.println("Maior de idade");
            System.out.println("Já pode ser preso");
        }

        
        byte opcao = 1;
        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                System.out.println("Soma");
                break;
            case 2:
                System.out.println("Opção 2");
                System.out.println("Divisão");
                break;
            case 5:
                System.out.println("Opção 5");
                System.out.println("Raiz quadrada");
                break;
            default:
                System.out.println("Opção inválida");
        }

        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " " + j);
            }
        }

        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int tamanho = teclado.nextInt();

        int numeros[] = new int[tamanho];
        
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Elemento " + i + ": ");
            numeros[i] = teclado.nextInt();
        }
        
        
        for (int i=0; i<numeros.length; i++)
            System.out.println("-- " + numeros[i]);

        
        for (int num : numeros)
            System.out.println("-- " + num);

    }

}
