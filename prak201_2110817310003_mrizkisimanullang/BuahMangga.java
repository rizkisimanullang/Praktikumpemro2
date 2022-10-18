/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak201_2110817310003_mrizkisimanullang;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
public class BuahMangga {
    String nama_mangga;
    float berat;
    int harga,jumlah;
    
    public BuahMangga (String nama_mangga, float berat,int harga,int jumlah){
    this.nama_mangga = nama_mangga;
    this.berat=berat;
    this.harga=harga;
    this.jumlah=jumlah;
  }
    public void displayStatus(){
    System.out.println("NamaMangga" + nama_mangga);
    System.out.println("Berat" + berat + "kg");
    System.out.println("JumlahBeli" + jumlah);
    System.out.println("TotalBerat" + berat * jumlah + "kg");
    System.out.println("TotalHarga" + "Rp" +jumlah * harga);
    
    }

}
