/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2011436227.latihan54.koordinat;

/**
 *
 * @author
 * Nama : Salsabila
 * Kelas : PBO FS112B
 * NIM : 2011436227
 */
public class PBO62011436227Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        warnaKoordinat wk = new warnaKoordinat(10, 4, "Jingga");
        Koordinat k = new Koordinat(10, 4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + k.x + ", " + " y : " + k.y);
    }
    
}
