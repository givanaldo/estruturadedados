package hash;

import java.util.HashMap;
import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        
        HashSet hash = new HashSet();
        hash.add(1);
        hash.add(5);
        hash.add(10);
        hash.add(28);
        System.out.println(hash.size());
        System.out.println(hash.contains(5));
        System.out.println(hash.contains(12));
        
        HashMap map = new HashMap();
        map.put("Alan", "84 2324-5657");
        map.put("Roberto", "81 33333-4444");
        map.put("João", "83 3322-5422");
        
        System.out.println(map.get("Alan"));
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
    
}
