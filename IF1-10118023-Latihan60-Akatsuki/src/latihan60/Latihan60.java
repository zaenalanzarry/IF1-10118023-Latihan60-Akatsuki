/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan60;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Akatsuki
 */

public class Latihan60 {

    public static void main(String[] args) {
        System.out.println("=====Akatsuki=====");
        System.out.println("\n=====Sekilas Info=====");
        Akatsuki akatsuki = new Akatsuki();
        akatsuki.tampilNama();
        akatsuki.asalDesa();
        akatsuki.Kekuatan();
        akatsuki.ciriKhas();
        
        AnggotaPerempuan aPerempuan = new AnggotaPerempuan();
        aPerempuan.tampilAnggotaPerempuan();
        
        KekuatanSpecialBoneka ksBoneka = new KekuatanSpecialBoneka();
        ksBoneka.tampilKekuatanSpecialBoneka();
        
        KekuatanSpecialMata ksMata = new KekuatanSpecialMata();
        ksMata.tampilKekuatanSpecialMata();
        
        MemilikiBanyakNyawa mbNyawa = new MemilikiBanyakNyawa();
        mbNyawa.tampilMemilikiBanyakNyawa();
    }
    
}
