package questao08;

public class DecBin {

    public static String dec2Bin(int dec) {
        String bin = "";
        if (dec == 0)
            return "0";
        else
            return bin += dec2Bin(dec/2) + dec%2;
    }

    public static void main(String[] args) {
        int n1 = 31;
        double n2 = 31.0;
        System.out.println(n1/2);
        System.out.println(n2/2);
        
        System.out.println("  0 --> " + dec2Bin(0));
        System.out.println(" 10 --> " + dec2Bin(10));
        System.out.println("  2 --> " + dec2Bin(2));
        System.out.println("199 --> " + dec2Bin(199));

    }
}
