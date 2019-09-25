package prova2019;

import java.util.Objects;

public class Disco {
    private String titulo;
    private String cantor;

    public Disco() {
    }
    
    public Disco(String titulo, String cantor) {
        this.titulo = titulo;
        this.cantor = cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "- " + titulo + " (" + cantor + ")";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disco other = (Disco) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.cantor, other.cantor)) {
            return false;
        }
        return true;
    }
    
}
