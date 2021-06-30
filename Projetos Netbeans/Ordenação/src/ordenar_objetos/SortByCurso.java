
package ordenar_objetos;

import java.util.Comparator;

public class SortByCurso implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return a1.compareByCurso(a2);
    }
    
}
