package intro;

public class TesteArvore {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(6);
        arvore.inserir(8);
        arvore.inserir(4);
        arvore.inserir(1);
        arvore.inserir(7);
        arvore.inserir(10);

        arvore.exibir();
        System.out.print("\nPré-ordem: ");
        arvore.preOrdem();
        System.out.print("\nEm-ordem: ");
        arvore.emOrdem();
        System.out.print("\nPós-ordem: ");
        arvore.posOrdem();
        System.out.println("\nBusca nó 8: " + arvore.buscar(8));
        System.out.println("Busca nó 2: " + arvore.buscar(2));
        
        Arvore novaArvore = new Arvore();
        int[] vetor = {7, 8, 2, 3, 6, 1, 11, 10};
        novaArvore.inserir(vetor);
        
        novaArvore.exibir();
        System.out.print("\nPré-ordem: ");
        novaArvore.preOrdem();
        System.out.print("\nEm-ordem: ");
        novaArvore.emOrdem();
        System.out.print("\nPós-ordem: ");
        novaArvore.posOrdem();
        System.out.println("\nBusca nó 8: " + arvore.buscar(8));
        System.out.println("Busca nó 12: " + arvore.buscar(12));
    }
}

// 5 3 6 8 4 1 7 10
//      |--- 5 ---|
//  |-- 3 --|     6 --|
//  1       4      |- 8 -|
//                 7     10

// 7 8 2 3 6 1 11 10
//            |---- 7 ----|
//         |- 2 -|        8 -|
//         1     3 -|   |-- 11
//                  6   10
// (7(2(1)(3(6)))(8(11)(10)))
