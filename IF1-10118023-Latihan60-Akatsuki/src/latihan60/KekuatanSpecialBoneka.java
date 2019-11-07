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
public class KekuatanSpecialBoneka extends Akatsuki{
    public void tampilKekuatanSpecialBoneka(){
        System.out.println("\n=====Anggota dengan Kekuatan Special Boneka=====");
        tampilNama();
        asalDesa();
        Kekuatan();
        ciriKhas();
    }
    
    @Override
    public void tampilNama(){
        System.out.println("Nama        : Sasori");
    }
    
    @Override
    public void asalDesa(){
        System.out.println("Desa        : Suna Gakure");
    }
    
    @Override
    public void Kekuatan(){
        System.out.println("Kekuatan    : Keahlian kugutsu, mengendalikan 100 boneka");
    }
    
    @Override
    public void ciriKhas(){
        System.out.println("Ciri Khas   : Seluruh tubuhnya kecuali jantung adalah boneka (kugutsu)");
    }
    
}
