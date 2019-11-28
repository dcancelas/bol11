package bol11_02;

public class Bol11_02 {

    public static void main(String[] args) {
        Media obx = new Media();
            obx.setNom("Libro");
            obx.setAutor("Sanderson");
            obx.setDuradaSegons(14);
        System.out.println("Nombre: "+obx.getNom()+" Autor: "+obx.getAutor()+" DuradaSegons: "+obx.getDuradaSegons());
    }
}
