package lista03.q05;

public class Main {
    public static void main(String[] args) {
        System.out.println(BemFormada.teste("()"));
        System.out.println(BemFormada.teste("[()]"));
        System.out.println(BemFormada.teste("[()"));
        System.out.println(BemFormada.teste("([((([])))])"));
        System.out.println(BemFormada.teste("([((([]))))]"));
        System.out.println("******");
        System.out.println(BemFormada.teste2("()"));
        System.out.println(BemFormada.teste2("[()]"));
        System.out.println(BemFormada.teste2("[()"));
        System.out.println(BemFormada.teste2("([((([])))])"));
        System.out.println(BemFormada.teste2("([((([]))))]"));

    }
}
