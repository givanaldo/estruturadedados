package prova2019;

import java.util.LinkedList;

public class Discoteca {

    // Como há inserções no início da lista, a lista ligada se
    // torna mais adequada.
    private static LinkedList<Disco> discos = new LinkedList<>();

    public static boolean buscaPorTitulo(String titulo) {
        for (Disco disco : discos) {
            if (titulo.equals(disco.getTitulo())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        discos.add(new Disco("Tomorrow Never Knows", "Beatles"));
        discos.add(new Disco("Thriller", "Michael Jackson"));
        discos.add(1, new Disco("Songs of Experience", "U2"));
        discos.add(new Disco("The Wall", "Pink Floyd"));
        discos.add(new Disco("Viva la Vida", "Coldplay"));
        discos.add(1, new Disco("Nevermind", "Nirvana"));
        discos.add(0, new Disco("Stripped", "Rolling Stones"));

        String titulo = "The Wall";
        if (buscaPorTitulo(titulo))
            System.out.println("O disco " + titulo + " está no meu acervo");
        else
            System.out.println("O disco " + titulo + " não está no meu acervo");

        titulo = "Back in Black";
        if (buscaPorTitulo(titulo))
            System.out.println("O disco " + titulo + " está no meu acervo");
        else
            System.out.println("O disco " + titulo + " não está no meu acervo");

        // listar todos
        System.out.println("\nDiscografia");
        for (Disco disco : discos)
            System.out.println(disco.toString());
        
        System.out.println("\nRecuperando disco Thriller...");
        System.out.println(discos.get(4).toString());
        
        System.out.println("\nExcluindo disco The Wall...");
        discos.remove(5);
        
        // listar todos
        System.out.println("\nDiscografia");
        for (Disco disco : discos)
            System.out.println(disco.toString());
        System.out.println("Total de discos: " + discos.size());
    }

}
