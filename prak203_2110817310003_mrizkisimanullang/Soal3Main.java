/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak03_2110817310003_mrizkisimanullang;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
    public class Soal3Main {
        
    public static void main(String[] args) {
            Pegawai p1 = new Pegawai();
            //kurang tanda ; pada p1.nama = "Roi"
            //ubah menjadi p1.nama = "Roi";
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";
            p1.setJabatan("Assasin");
            //karena pada soal memerlukan output umur, maka tambahkan variabel umur
            //tambahkan p1.umur = 17;
            p1.umur = 17;
            
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //ubah nilai yang dipanggil dari p1.umur menjadi p1.getUmur()
        System.out.println("Umur: " + p1.getUmur());
    }
    }