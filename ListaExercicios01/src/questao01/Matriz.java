package questao01;

import javax.swing.JOptionPane;

public class Matriz {

    private int[][] m;
    private int lin, col;

    public Matriz(int lin, int col) {
        this.lin = lin;
        this.col = col;
        m = new int[lin][col];
    }

    public Matriz(int[][] dados) {
        lin = dados.length;
        col = dados[0].length;
        this.m = new int[lin][col];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                this.m[i][j] = dados[i][j];
            }
        }
    }

    public static Matriz identidade(int n) {
        Matriz mI = new Matriz(n, n);
        for (int i = 0; i < n; i++) {
            mI.m[i][i] = 1;
        }
        return mI;
    }

    public Matriz soma(Matriz mB) {
        Matriz mA = this;
        if (mA.lin != mB.lin || mA.col != mB.col) {
            throw new RuntimeException("As dimensões não conferem.");
        }
        Matriz mSoma = new Matriz(lin, col);
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < lin; j++) {
                mSoma.m[i][j] = mA.m[i][j] + mB.m[i][j];
            }
        }
        return mSoma;
    }

    public Matriz subtracao(Matriz mB) {
        Matriz mA = this;
        if (mA.lin != mB.lin || mA.col != mB.col) {
            throw new RuntimeException("As dimensões não conferem.");
        }
        Matriz mSoma = new Matriz(lin, col);
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < lin; j++) {
                mSoma.m[i][j] = mA.m[i][j] - mB.m[i][j];
            }
        }
        return mSoma;
    }

    public Matriz multiplicacao(Matriz mB) {
        Matriz mA = this;
        if (mA.col != mB.lin) {
            throw new RuntimeException("As dimensões não conferem.");
        }
        Matriz mMulti = new Matriz(mA.lin, mB.col);
        for (int i = 0; i < mMulti.lin; i++) {
            for (int j = 0; j < mMulti.col; j++) {
                for (int k = 0; k < mA.col; k++) {
                    mMulti.m[i][j] += (mA.m[i][k] * mB.m[k][j]);
                }
            }
        }
        return mMulti;
    }

    public void exibeMatriz(String nome) {
        String str = "";
        for (int i = 0; i < lin; i++) {
            str += "| ";
            for (int j = 0; j < col; j++) {
                str += m[i][j] + "  ";
            }
            str += ("|\n");
        }
        JOptionPane.showMessageDialog(null, str,
                nome, JOptionPane.INFORMATION_MESSAGE);
    }
}
