/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan60;

/**
 *
 * @author Zaenal PC
 */
public class MemilikiBanyakNyawa extends Akatsuki{
    public void tampilMemilikiBanyakNyawa(){
        System.out.println("\n=====Anggota yang Memiliki Banyak Nyawa=====");
        tampilNama();
        asalDesa();
        Kekuatan();
        ciriKhas();
    }
    
    @Override
    public void tampilNama(){
        System.out.println("Nama        : 1. Kakuzu");
        System.out.println("              2. Pain Tendo (Nagato Uzumaki)");
    }
    
    @Override
    public void asalDesa(){
        System.out.println("Desa        : 1. Taki Gakure");
        System.out.println("              2. Ame Gakure");
    }
    
    @Override
    public void Kekuatan(){
        System.out.println("Kekuatan    : 1. Bisa memisah tubuh menjadi 5 bagian dan bisa menggunakan jurus-jurus ke lima elemen dasar");
        System.out.println("              2. Bertarung dengan keenam pain yang memiliki kemampuan berbeda-beda");
        System.out.println("                 yang dapat dibangkitkan kembali jika mati dengan korban manusia");
    }
    
    @Override
    public void ciriKhas(){
        System.out.println("Ciri Khas   : 1. Memakai penutup wajah, dapat memperpanjang hidupnya dengan cara mengambil jantung manusia");
        System.out.println("              2. Memiliki besi hitam berupa tindikan di hampir seluruh tubuh, rambut berwarna jingga");
    }
    
}
