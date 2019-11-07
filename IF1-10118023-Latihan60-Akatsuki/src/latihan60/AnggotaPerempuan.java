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
public class AnggotaPerempuan extends Akatsuki{
    public void tampilAnggotaPerempuan(){
        System.out.println("\n=====Anggota Perempuan Akatsuki=====");
        tampilNama();
        asalDesa();
        Kekuatan();
        ciriKhas();
    } 
    
    @Override
    public void tampilNama(){
        System.out.println("Nama        : Konan");
    }
    
    @Override
    public void asalDesa(){
        System.out.println("Desa        : Ame Gakure");
    }
    
    @Override
    public void Kekuatan(){
        System.out.println("Kekuatan    : Kertas origami yang bisa berbentuk apa saja");
    }
    
    @Override
    public void ciriKhas(){
        System.out.println("Ciri Khas   : Memiliki aksesoris origami bunga di kepala, berambut biru");
    }
    
}
