package listalinear;

public class Celula {
    private Pessoa elemento;
    private Celula proximo;

    public Celula(Pessoa elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public Celula(Pessoa elemento) {
        this.elemento = elemento;
    }

    public Pessoa getElemento() {
        return elemento;
    }

    public void setElemento(Pessoa elemento) {
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
    
    
}
