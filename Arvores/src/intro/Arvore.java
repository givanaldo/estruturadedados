package intro;

public class Arvore {

    private NoArvore raiz;

    public Arvore() {
        this.raiz = null;
    }

    public Arvore(NoArvore raiz) {
        this.raiz = raiz;
    }

    public boolean vazia() {
        return this.raiz == null;
    }

    public NoArvore getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore raiz) {
        this.raiz = raiz;
    }


    public void inserir(int valor) {
        inserir(this.raiz, new NoArvore(valor));
    }

    public void inserir(int[] vetorNos) {
        for (int no : vetorNos) {
            inserir(this.raiz, new NoArvore(no));
        }
    }
    
    private void inserir(NoArvore pai, NoArvore no) {
        if (this.raiz == null) {
            this.raiz = no;
        } else {
            if (no.getValor() < pai.getValor()) {
                if (pai.getEsquerda() == null) {
                    pai.setEsquerda(no);
                } else {
                    inserir(pai.getEsquerda(), no);
                }

            } else {
                if (pai.getDireita() == null) {
                    pai.setDireita(no);
                } else {
                    inserir(pai.getDireita(), no);
                }
            }
        }
    }

    public void preOrdem() {
        preOrdem(this.raiz);
    }

    private void preOrdem(NoArvore no) {
        if (no != null) {
            System.out.print(no.getValor() + " ");
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    public void emOrdem() {
        emOrdem(this.raiz);
    }

    private void emOrdem(NoArvore no) {
        if (no != null) {
            emOrdem(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            emOrdem(no.getDireita());
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(NoArvore no) {
        if (no != null) {
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.print(no.getValor() + " ");
        }
    }

    public boolean buscar(int valor) {
        NoArvore no = buscar(this.raiz, valor);
        if (no == null)
            return false;
        else
            return no.getValor() == valor;
    }
    
    private NoArvore buscar(NoArvore no, int valor) {
        if (no == null || no.getValor() == valor)
            return no;
        if (valor < no.getValor())
            return buscar(no.getEsquerda(), valor);
        else
            return buscar(no.getDireita(), valor);
    }
    
    //public boolean remover(int valor) {
    //  remover(this.raiz, new NoArvore(valor));
    //}
    
    //private void remover(NoArvore pai, NoArvore no) {
    
    //}
    
    
    public void exibir() {
        exibir(this.raiz);
    }

    public void exibir(NoArvore no) {
        System.out.print("(" + no.getValor());
        if (no.getEsquerda() != null)
            exibir(no.getEsquerda());
        if (no.getDireita() != null)
            exibir(no.getDireita());        
        System.out.print(")");
    }
    
}
