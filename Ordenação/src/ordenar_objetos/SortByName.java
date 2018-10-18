package ordenar_objetos;

import java.util.Comparator;

class SortByName implements Comparator<Aluno> {

    public int compare(Aluno a, Aluno b) {
        return a.compareTo(b);
    }
}
