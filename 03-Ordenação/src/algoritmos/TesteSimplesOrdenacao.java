package algoritmos;

public class TesteSimplesOrdenacao {
    
    public static void main(String[] args) {

        int[] vetor1 = {3, 6, 2, 9, 8, 7, 4};
        int[] vetor2 = vetor1.clone();
        int[] vetor3 = vetor1.clone();
        
        Sort.bubblesort(vetor1);
        System.out.println("BubbleSort");
        for (int i=0; i<vetor1.length; i++)
            System.out.printf("%d ", vetor1[i]);
        System.out.println("\n");
       
        Sort.selectionsort(vetor2);
        System.out.println("SelectionSort");
        for (int i=0; i<vetor2.length; i++)
            System.out.printf("%d ", vetor2[i]);
        System.out.println("\n");
        
        Sort.insertionsort(vetor3);
        System.out.println("InsertionSort");
        for (int i=0; i<vetor3.length; i++)
            System.out.printf("%d ", vetor3[i]);
        System.out.println("\n");
    }
    
}
