package listalinear;

public class ListaEncadeada {
    private Celula primeira;
    private Celula ultima;
    
    public void adiciona(Pessoa elemento) {
        Celula celula = new Celula(elemento);
        if (primeira == null) {
           primeira = celula;
           ultima = celula;
        }
        else {
            ultima.setProximo(celula);
            ultima = celula;
        }
    }
    
    public void adiciona(int posicao, Pessoa elemento) {

    }
    
    public void adicionaInicio(Pessoa elemento) {
        
    }
    
    public void remover() {
        
    }
    
    public void listarTodos() {
        Celula aux = primeira;
        while (aux != null) {
            Pessoa p = aux.getElemento();
            System.out.println(p.toString());
            aux = aux.getProximo();
        }
    }
}
