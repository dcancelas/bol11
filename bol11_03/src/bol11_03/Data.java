package bol11_03;

public class Data {

    private int dia;
    private int mes;
    private int any;

    public Data() {
    }
    public Data(int d, int m, int a) {
        dia = d;
        mes = m;
        any = a;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAny() {
        return any;
    }
    public void setAny(int any) {
        this.any = any;
    }

    public void comprobarFecha() {
        if((dia > 31) || (dia <= 0)) System.out.println("\nERROR: Numero de días incorrecto");
        else {
            if((mes > 12) || (mes <= 0)) System.out.println("\nERROR: El mes introducido no existe");
            else {
                if(any <= 0) System.out.println("\nERROR: El año no puede ser inferior a 1");
                else {
                    switch(mes) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            if(dia > 31) System.out.println("\nERROR: El mes "+mes+" tiene sólo 31 días");
                            else mostrarFecha();
                            break;
                        case 2:
                            if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) {
                                if(dia > 29) System.out.println("\nERROR: Como el año es bisiesto, el mes "+mes+" tiene sólo 29 días");
                                else mostrarFecha();
                            }
                            else {
                                if(dia > 28) System.out.println("\nERROR: El mes "+mes+" tiene sólo 28 días");
                                else mostrarFecha();
                            }
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if(dia > 30) System.out.println("\nERROR: El mes "+mes+" tiene sólo 30 días");
                            else mostrarFecha();
                            break;
                    }
                }
            }
        }
    }
    public void mostrarFecha() {
        System.out.println("\nFecha: "+getDia()+"/"+getMes()+"/"+getAny());
    }
}
