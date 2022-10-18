/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prak03_2110817310003_mrizkisimanullang;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
//Class yang dipakai adalah Pegawai, bukan Employee yang tertulis di source code//
//karenanya class Employee tidak dapat berfungsi pada Soal3Main sebelumnya//
//perbaiki dengan ganti class tersebut menjadi public class Pegawai//

    public class Pegawai {
        public String nama;

        //Penggunaan tipe data char pada variabel asal tidak tepat
        //hal ini karenakan penngunaan untuk type data char terbatas
        //huruf pada jumlah nilai yang dimasukan/
        //ubah "public char asal;" menjadi "public String asal;"//

        public String asal;
        public String jabatan;
        public int umur;

        //setelah kita menambahkan instansiasi baru di file main,
        //kita juga harus menambahkan metode get pada file class
        //tambahkan public int getUmur seperti dibawah ini//

        public int getUmur(){
            return umur;
        }
        public String getNama() {
            return nama;
        }
        public String getAsal() {
            return asal;
        }

        //error karena variabel j belum diberi parameter sehingga tidak dapat diidentifikasi
        //solusinya tambahkan String j dalam parameter setJabatan()
        //"public void setJabatan(){"
        //diubah menjadi
        //"public void setJabatan(String j){"//

        public void setJabatan(String j){
            this.jabatan = j;
        }
}
