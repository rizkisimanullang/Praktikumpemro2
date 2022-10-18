/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prak201_2110817310003_mrizkisimanullang;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
public class PRAK201_2110817310003_MRIZKISIMANULLANG {

    public static void main(String[] args) {
        BuahMangga Arumanis = new BuahMangga ("Arumanis", 0.3f, 5000, 13);
        BuahMangga Manalagi = new BuahMangga ("Manalagi", 0.5f, 7500, 17);
        BuahMangga Madu = new BuahMangga ("Madu", 0.375f, 6500, 12);
        Arumanis.displayStatus();
        System.out.println();
        Manalagi.displayStatus();
        System.out.println();
        Madu.displayStatus();
        System.out.println();
    }
}
