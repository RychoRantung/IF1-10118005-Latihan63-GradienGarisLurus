/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan63.gradiengarislurus;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Program menggunakan konsep interface dengan konsep pendekatan berbasis objek
 */
public class IF110118005Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koor = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik " + "(" + koor.getX1() + "," +
                koor.getY1() + ")" + " dan " + "(" + koor.getX2() + "," + koor.getY2() + ")");
        System.out.println("memiliki gradien sebesar " +  koor.hitungGradien());
        
        Koordinat koor1 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik " + "(" + koor1.getX1() + "," +
                koor1.getY1() + ")" + " dan " + "(" + koor1.getX2() + "," + koor1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " +  koor1.hitungGradien());
    }
        
    }
    

