/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.warnet;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class Warnet {
    public static void main(String[] args) {
        KomputerService service = new KomputerService();
        Validasi validasi = new Validasi();
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
 
        while (lanjut) {
            System.out.println("=================================");
            System.out.println("     Selamat datang di Warnet!   ");
            System.out.println("=================================");
            System.out.println("1. Tambah Komputer");
            System.out.println("2. Lihat Semua Komputer");
            System.out.println("3. Ubah Data Komputer");
            System.out.println("4. Hapus Komputer");
            System.out.println("5. Booking Komputer");
            System.out.println("6. Kosongkan Komputer");
            System.out.println("7. Keluar");
            System.out.println("=================================");
            System.out.print("Menu>> ");
            int pilihan = Integer.parseInt(input.nextLine());
 
            switch (pilihan) {
                case 1:
                    System.out.print("Nomor Komputer : ");
                    int nomor = Integer.parseInt(input.nextLine());
                    System.out.print("Spesifikasi    : ");
                    String spesifikasi = input.nextLine();
                    System.out.print("Harga per Jam  : ");
                    double harga = Double.parseDouble(input.nextLine());
 
                    if (validasi.hargaValid(harga)) {
                        service.tambah(new Komputer(nomor, spesifikasi, harga));
                    } else {
                        System.out.println("Harga per jam harus lebih dari 0.");
                    }
                    break;
 
                case 2:
                    service.tampilkanSemua();
                    break;
 
                case 3:
                    System.out.print("Masukkan nomor komputer yang ingin diubah: ");
                    int nomorUbah = Integer.parseInt(input.nextLine());
                    System.out.print("Spesifikasi baru   : ");
                    String spesifikasiBaru = input.nextLine();
                    System.out.print("Harga per jam baru : ");
                    double hargaBaru = Double.parseDouble(input.nextLine());
 
                    if (!validasi.hargaValid(hargaBaru)) {
                        System.out.println("Harga per jam harus lebih dari 0.");
                        break;
                    }
 
                    boolean berhasilUbah = service.ubah(nomorUbah, spesifikasiBaru, hargaBaru);
                    if (berhasilUbah) {
                        System.out.println("Data berhasil diubah.");
                    } else {
                        System.out.println("Komputer dengan nomor tersebut tidak ditemukan.");
                    }
                    break;
 
                case 4:
                    System.out.print("Masukkan nomor komputer yang ingin dihapus: ");
                    int nomorHapus = Integer.parseInt(input.nextLine());
 
                    boolean berhasilHapus = service.hapus(nomorHapus);
                    if (berhasilHapus) {
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Komputer dengan nomor tersebut tidak ditemukan.");
                    }
                    break;
 
                case 5:
                    System.out.print("Masukkan nomor komputer yang ingin dibooking: ");
                    int nomorBooking = Integer.parseInt(input.nextLine());
 
                    String hasilBooking = service.booking(nomorBooking);
                    if (hasilBooking.equals("berhasil")) {
                        System.out.println("Komputer berhasil dibooking.");
                    } else if (hasilBooking.equals("sudah_dipakai")) {
                        System.out.println("Komputer sedang dipakai orang lain.");
                    } else {
                        System.out.println("Komputer dengan nomor tersebut tidak ditemukan.");
                    }
                    break;
 
                case 6:
                    System.out.print("Masukkan nomor komputer yang ingin dikosongkan: ");
                    int nomorKosong = Integer.parseInt(input.nextLine());
 
                    String hasilKosong = service.kosongkan(nomorKosong);
                    if (hasilKosong.equals("berhasil")) {
                        System.out.println("Komputer berhasil dikosongkan.");
                    } else if (hasilKosong.equals("belum_dipakai")) {
                        System.out.println("Komputer ini memang sedang kosong.");
                    } else {
                        System.out.println("Komputer dengan nomor tersebut tidak ditemukan.");
                    }
                    break;
 
                case 7:
                    lanjut = false;
                    System.out.println("Program selesai. Terima kasih.");
                    break;
 
                default:
                    System.out.println("Pilihan tidak tersedia, coba lagi.");
            }
        }
    }
}
 
