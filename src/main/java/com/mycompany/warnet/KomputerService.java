/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.warnet;
import java.util.ArrayList;
/**
 *
 * @author LOQ
 */

public class KomputerService {
    ArrayList<Komputer> daftarKomputer;
 
    public KomputerService() {
        daftarKomputer = new ArrayList<>();
 
        Komputer pc1 = new Komputer(1, "Ryzen 5 5600, RTX 3050 Ti, RAM 16GB", 5000);
        pc1.dipakai = true;
        daftarKomputer.add(pc1);
 
        Komputer pc2 = new Komputer(2, "Intel i5-12400F, RTX 3060, RAM 16GB", 6000);
        daftarKomputer.add(pc2);
    }
 
    public void tambah(Komputer komputer) {
        daftarKomputer.add(komputer);
        System.out.println("Komputer berhasil ditambahkan.");
    }
 
    public void tampilkanSemua() {
        if (daftarKomputer.isEmpty()) {
            System.out.println("Belum ada data komputer.");
            return;
        }
        for (int i = 0; i < daftarKomputer.size(); i++) {
            System.out.println("--------------------");
            daftarKomputer.get(i).tampilkanInfo();
        }
    }
 
    public Komputer cariByNomor(int nomor) {
        for (int i = 0; i < daftarKomputer.size(); i++) {
            if (daftarKomputer.get(i).nomor == nomor) {
                return daftarKomputer.get(i);
            }
        }
        return null;
    }
 
    public boolean ubah(int nomor, String spesifikasiBaru, double hargaBaru) {
        Komputer k = cariByNomor(nomor);
        if (k == null) {
            return false;
        }
        k.spesifikasi = spesifikasiBaru;
        k.hargaPerJam = hargaBaru;
        return true;
    }
 
    public boolean hapus(int nomor) {
        Komputer k = cariByNomor(nomor);
        if (k == null) {
            return false;
        }
        daftarKomputer.remove(k);
        return true;
    }
 
    public String booking(int nomor) {
        Komputer k = cariByNomor(nomor);
        if (k == null) {
            return "tidak_ditemukan";
        }
        if (k.dipakai) {
            return "sudah_dipakai";
        }
        k.dipakai = true;
        return "berhasil";
    }
 
    public String kosongkan(int nomor) {
        Komputer k = cariByNomor(nomor);
        if (k == null) {
            return "tidak_ditemukan";
        }
        if (!k.dipakai) {
            return "belum_dipakai";
        }
        k.dipakai = false;
        return "berhasil";
    }
}

