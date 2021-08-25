package hash;

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
    }
    
} 
