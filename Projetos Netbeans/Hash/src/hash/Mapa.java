package hash;

import java.util.HashMap;

public class Mapa {

    public static void main(String[] args) {

        HashMap<String, Carro> mapa = new HashMap<>();
        mapa.put("ABC-1234", new Carro("Fusca", "VW", 1981));
        System.out.println(mapa);
        mapa.put("DEF-1234", new Carro("Kombi", "VW", 1976));
        System.out.println(mapa);
        mapa.put("ABC-1234", new Carro("Chevette", "GM", 1982));
        System.out.println(mapa);

        System.out.println("");

        System.out.println(mapa.keySet());
        System.out.println(mapa.values());
        
        System.out.println("");

        System.out.println(mapa.containsKey("ABC-1234"));
        System.out.println(mapa.get("ABC-1234"));
        mapa.remove("ABC-1234");
        System.out.println(mapa);
    }
}
