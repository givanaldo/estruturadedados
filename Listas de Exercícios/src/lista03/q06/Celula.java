package lista03.q06;

public class Celula {
    private Automóvel elemento;
    private Celula proximo;

    public Celula(Automóvel elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public Celula(Automóvel elemento) {
        this.elemento = elemento;
    }

    public Automóvel getElemento() {
        return elemento;
    }

    public void setElemento(Automóvel elemento) {
        this.elemento = elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
