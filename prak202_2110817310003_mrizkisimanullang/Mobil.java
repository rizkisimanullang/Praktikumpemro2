/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak202_2110817310003_mrizkisimanullang;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
public class Mobil {
    String merek, tahun_keluaran;
    private String Pemilik;
    int kapasitas;
    int harga;
    long Pajak;
    
    public void setPemilik(String namaPemilik) {
        Pemilik = namaPemilik;
    }
           
    public String getPemilik(){
        return Pemilik;
    }
    
    public void setPajak(int pajakMobil){
        Pajak = pajakMobil;
    }
        
    public String getPajak(){
        return String.format("%,d", (this.harga/100)*2);
    }

    public void info(){
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " +String.format("%,d", this.harga));
        System.out.println("Tahun Keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas + "cc");
        Pajak =(long)(harga*0.02);
    }
}


