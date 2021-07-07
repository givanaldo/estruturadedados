package objetos;

import java.util.Comparator;

public class SortByAge implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.compareByIdade(o2);
    }
    
}
