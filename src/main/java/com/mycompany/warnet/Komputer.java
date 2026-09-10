/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warnet;

/**
 *
 * @author LOQ
 */

public class Komputer {
    int nomor;
    String spesifikasi;
    double hargaPerJam;
    boolean dipakai;
 
    public Komputer(int nomor, String spesifikasi, double hargaPerJam) {
        this.nomor = nomor;
        this.spesifikasi = spesifikasi;
        this.hargaPerJam = hargaPerJam;
        this.dipakai = false;
    }
 
    public void tampilkanInfo() {
        String status = dipakai ? "Sedang Dipakai" : "Kosong";
        System.out.println("Nomor         : " + nomor);
        System.out.println("Spesifikasi   : " + spesifikasi);
        System.out.println("Harga per Jam : Rp" + hargaPerJam);
        System.out.println("Status        : " + status);
    }
}
