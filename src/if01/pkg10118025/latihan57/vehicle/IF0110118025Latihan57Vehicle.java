/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan57.vehicle;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle bc, sb;

        bc = new Bicycle();
        bc.setMyBrand("Trek Bike");
        bc.setMyModel("7.4FX");
        ((Bicycle) bc).setMyGearCount(23);
        System.out.printf("Brand\t\t: %s%n", bc.getMyBrand());
        System.out.printf("Model\t\t: %s%n", bc.getMyModel());
        System.out.printf("Jumlah Gear\t: %s%n%n", ((Bicycle) bc).getMyGearCount());

        sb = new Skateboard();
        sb.setMyBrand("Ally Skate");
        sb.setMyModel("Rocket");
        ((Skateboard) sb).setMyBoardLength(54.5);
        System.out.printf("Brand\t\t: %s%n", sb.getMyBrand());
        System.out.printf("Model\t\t: %s%n", sb.getMyModel());
        System.out.printf("Jumlah Gear\t: %s%n%n", ((Skateboard) sb).getMyBoardLength());
    }
    
}
