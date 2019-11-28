package bol11_03;

import java.util.Scanner;

public class Bol11_03 {

    public static void main(String[] args) {
        Data obx = new Data();
            Scanner sc = new Scanner(System.in);
                System.out.print("Introduzca el día: ");
                    obx.setDia(sc.nextInt());
                System.out.print("Introduzca el mes: ");
                    obx.setMes(sc.nextInt());
                System.out.print("Introduzca el año: ");
                    obx.setAny(sc.nextInt());

            obx.comprobarFecha();
    }
}
