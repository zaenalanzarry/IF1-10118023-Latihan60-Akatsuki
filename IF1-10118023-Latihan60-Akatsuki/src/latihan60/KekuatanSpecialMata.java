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
public class KekuatanSpecialMata extends Akatsuki{
    public void tampilKekuatanSpecialMata(){
        System.out.println("\n=====Anggota dengan Kekuatan Special Mata=====");
        tampilNama();
        asalDesa();
        Kekuatan();
        ciriKhas();
    }
    
    @Override
    public void tampilNama(){
        System.out.println("Nama        : 1. Tobi (Uchiha Obito)");
        System.out.println("              2. Pain Tendo (Nagato Uzumaki)");
        System.out.println("              3. Itachi Uchiha");
    }
    
    @Override
    public void asalDesa(){
        System.out.println("Desa        : 1. Konoha Gakure");
        System.out.println("              2. Ame Gakure");
        System.out.println("              3. Konoha Gakure");
    }
    
    @Override
    public void Kekuatan(){
        System.out.println("Kekuatan    : 1. Sharingan, Mangekyo Sharingan yang dapat membuat tubuhnya tembus dari serangan");
        System.out.println("              2. Bertarung dengan keenam pain yang memiliki kemampuan berbeda-beda");
        System.out.println("                 yang dapat dibangkitkan kembali jika mati dengan korban manusia");
        System.out.println("              3. Sharingan, Amaterasu, Mangekyo Sharingan, Susano'o");
    }
    
    @Override
    public void ciriKhas(){
        System.out.println("Ciri Khas   : 1. Topeng jingga dengan satu lubang mata dengan pola pusaran yang terpusat pada mata kanan");
        System.out.println("              2. Memiliki besi hitam berupa tindikan di hampir seluruh tubuh, rambut berwarna jingga");
        System.out.println("              3. Berambut belah tengah, ahli dalam Genjutsu, memakai sharingan dan mangekyo sharingan");
    }
    
}
