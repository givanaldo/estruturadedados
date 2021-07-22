package lista02.q07;

import java.util.Comparator;

public class SortByNome implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return (int) o1.comparePorNome(o2);
    }
    
}
