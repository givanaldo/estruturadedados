package hash;

import java.util.HashMap;
import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        System.out.println(hash.hashCode());
        hash.add(5);
        System.out.println(hash.hashCode());
        hash.add(10);
        System.out.println(hash.hashCode());
        hash.add(28);
        System.out.println(hash.hashCode());
        System.out.println(hash.size());
        System.out.println(hash.contains(5));
        System.out.println(hash.contains(12));
        System.out.println(hash);
        System.out.println(hash.hashCode());
        
        
        HashMap<String, String> map = new HashMap<>();
        map.put("Alan", "(84) 2324-5657");
        map.put("Roberto", "(81) 33333-4444");
        map.put("João", "(83) 3322-5422");
        
        System.out.println(map.get("Alan"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        
    }
    
} 
