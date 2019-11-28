package bol11_01;

import org.jetbrains.annotations.Contract;

public class ClasseA {

    private int valorPrimari;
    private int valorSecundari;

    public int getValorPrimari() {
        return valorPrimari;
    }
    public void setValorPrimari(int valorPrimari) {
        this.valorPrimari = valorPrimari;
    }
    public int getValorSecundari() {
        return valorSecundari;
    }
    public void setValorSecundari(int valorSecundari) {
        this.valorSecundari = valorSecundari;
    }

    public ClasseA() {
        valorPrimari = 5;
        valorSecundari = 10;
    }
    public ClasseA(int vp) {
        valorPrimari = vp;
        valorSecundari = 10;
    }
    public ClasseA(int vp, int vs) {
        valorPrimari = vp;
        valorSecundari = vs;
    }
}
