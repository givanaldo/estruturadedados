package ordenar_objetos;

import java.util.Comparator;

class SortByName implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return a1.compareByNome(a2);
    }

}
