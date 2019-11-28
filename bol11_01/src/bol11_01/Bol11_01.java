package bol11_01;

public class Bol11_01 {

    public static void main(String[] args) {
        ClasseA a = new ClasseA();
        ClasseA b = new ClasseA(20);
        ClasseA c = new ClasseA(20, 40);

        System.out.println("El objeto _a: _ contiene: "+a.getValorPrimari()+", "+a.getValorSecundari());
        System.out.println("El objeto _b: _ contiene: "+b.getValorPrimari()+", "+b.getValorSecundari());
        System.out.println("El objeto _c: _ contiene: "+c.getValorPrimari()+", "+c.getValorSecundari());
        System.out.println("El objeto _c: _ contiene: "+c.getValorPrimari()+", "+c.getValorSecundari());
    }
}
