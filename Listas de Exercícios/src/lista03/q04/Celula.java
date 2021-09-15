package lista03.q04;

public class Celula {
    private Produto elemento;
    private Celula proximo;

    public Celula(Produto elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public Celula(Produto elemento) {
        this.elemento = elemento;
    }

    public Produto getElemento() {
        return elemento;
    }

    public void setElemento(Produto elemento) {
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
