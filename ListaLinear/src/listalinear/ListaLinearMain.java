package listalinear;

import java.util.Scanner;

public class ListaLinearMain {

    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João", "98888-0088", "joao@gmail.com");
        Pessoa maria = new Pessoa("Maria", "99999-3333", "maria@gmail.com");
        Pessoa gabriel = new Pessoa();
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        gabriel.setNome(teclado.nextLine());
                
        System.out.println(joao.toString());
        System.out.println(maria.toString());
        System.out.println(gabriel.toString());
    }
    
}
