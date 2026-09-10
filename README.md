#SISTEM MANAJEMEN WARNET#
Deskripsi Program

Program ini adalah aplikasi CRUD berbasis console yang dibuat menggunakan Java dengan konsep OOP (Object Oriented Programming). Program ini mensimulasikan sistem manajemen komputer pada sebuah warnet, di mana pengelola bisa menambah, melihat, mengubah, menghapus, sekaligus mengatur status pemakaian (booking) tiap unit komputer yang tersedia. Data komputer disimpan sementara menggunakan ArrayList selama program berjalan.

Struktur Program

Program ini terdiri dari 4 class:

Komputer — class entitas yang menyimpan data satu unit komputer (nomor, spesifikasi, harga per jam, dan status pemakaian).
KomputerService — class yang menangani seluruh logic CRUD (tambah, lihat, ubah, hapus, booking, kosongkan) dan menyimpan data komputer dalam ArrayList.
Validasi — class yang mengecek apakah harga per jam yang diinput valid (lebih dari 0).
Warnet — class utama (entry point) yang berisi tampilan menu, input dari user, serta perulangan dan percabangan untuk menjalankan program.
Penjelasan Alur Program

Saat program dijalankan, sistem akan langsung menampilkan menu utama secara berulang menggunakan perulangan while, sehingga program terus berjalan sampai user memilih menu keluar. Setiap pilihan menu dipilih lewat input angka yang diproses menggunakan percabangan switch-case.

[SS Output Tampilan Menu Utama]

lanjut penjelasan kamu

1. Tambah Komputer

User diminta memasukkan nomor komputer, spesifikasi, dan harga per jam. Sebelum data disimpan, harga yang diinput akan dicek dulu lewat class Validasi — kalau harganya tidak lebih dari 0, data tidak akan ditambahkan dan program akan menampilkan pesan error.

[SS Output Tambah Komputer]

lanjut penjelasan kamu

2. Lihat Semua Komputer

Seluruh data komputer yang tersimpan di ArrayList akan ditampilkan satu per satu menggunakan perulangan for, lengkap dengan nomor, spesifikasi, harga per jam, dan status pemakaiannya.

[SS Output Lihat Semua Komputer]

lanjut penjelasan kamu

3. Ubah Data Komputer

User memasukkan nomor komputer yang ingin diubah beserta spesifikasi dan harga barunya. Program akan mencari data dengan nomor tersebut di dalam ArrayList; jika ditemukan, datanya akan diperbarui, jika tidak, program menampilkan pesan bahwa data tidak ditemukan.

[SS Output Ubah Data Komputer]

lanjut penjelasan kamu

4. Hapus Komputer

User memasukkan nomor komputer yang ingin dihapus. Jika nomor tersebut ada di dalam ArrayList, datanya akan dihapus dari daftar.

[SS Output Hapus Komputer]

lanjut penjelasan kamu

5. Booking Komputer

User memasukkan nomor komputer yang ingin dibooking. Jika komputer tersebut berstatus kosong, statusnya akan diubah menjadi dipakai. Jika komputer sudah dipakai sebelumnya, program akan memberi tahu bahwa komputer tersebut tidak tersedia.

[SS Output Booking Komputer]

lanjut penjelasan kamu

6. Kosongkan Komputer

User memasukkan nomor komputer yang ingin dikosongkan kembali. Jika komputer tersebut sedang berstatus dipakai, statusnya akan diubah kembali menjadi kosong, sama seperti kondisi awal.

[SS Output Kosongkan Komputer]

lanjut penjelasan kamu

7. Keluar

Program akan menghentikan perulangan while sehingga aplikasi berhenti berjalan.

[SS Output Keluar Program]

lanjut penjelasan kamu
