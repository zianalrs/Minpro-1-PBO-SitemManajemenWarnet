**SISTEM MANAJEMEN WARNET**

---

Deskripsi Program

Program ini adalah aplikasi CRUD berbasis console yang dibuat menggunakan Java dengan konsep OOP (Object Oriented Programming). Program ini mensimulasikan sistem manajemen komputer pada sebuah warnet, di mana pengelola bisa menambah, melihat, mengubah, menghapus, sekaligus mengatur status pemakaian (booking) tiap unit komputer yang tersedia. Data komputer disimpan sementara menggunakan ArrayList selama program berjalan, sehingga data akan kembali ke kondisi awal setiap kali program dijalankan ulang.

---

Struktur Program

Program ini terdiri dari 4 class:

- Komputer, class entitas yang menyimpan data satu unit komputer (nomor, spesifikasi, harga per jam, dan status pemakaian).
- KomputerService, class yang menangani seluruh logic CRUD (tambah, lihat, ubah, hapus, booking, kosongkan) dan menyimpan data komputer dalam ArrayList.
- Validasi, class yang mengecek apakah harga per jam yang diinput valid (lebih dari 0).
- Warnet, class utama (entry point) yang berisi tampilan menu, input dari user, serta perulangan dan percabangan untuk menjalankan program.

---

Fitur Program

1. Menambahkan data komputer baru ke daftar
2. Menampilkan seluruh data komputer yang tersimpan
3. Mengubah spesifikasi dan harga sewa komputer yang sudah ada
4. Menghapus data komputer dari daftar
5. Membooking komputer yang sedang kosong
6. Mengosongkan kembali komputer yang sudah selesai dipakai

---

Penjelasan Alur Program

Program dimulai dari class Warnet yang menjadi entry point aplikasi. Di dalamnya, dibuat satu objek KomputerService untuk mengelola data komputer dan satu objek Validasi untuk mengecek kevalidan harga, keduanya dipakai berulang kali selama program berjalan.

Begitu program dijalankan, sistem langsung masuk ke perulangan while yang membuat menu utama terus tampil selama variabel penanda (lanjut) masih bernilai true. Setiap kali menu muncul, program menunggu user mengetik angka pilihan, lalu angka tersebut diproses melalui percabangan switch-case untuk menentukan aksi apa yang dijalankan. Setiap pilihan pada dasarnya hanya memanggil method yang sesuai di KomputerService, artinya class Warnet tidak menyimpan atau memanipulasi data komputer secara langsung, hanya menjembatani input user ke logic yang ada di KomputerService.

Perulangan ini baru berhenti ketika user memilih menu Keluar (mengubah lanjut menjadi false), sehingga program tidak akan berhenti sendiri di tengah jalan kecuali user memang meminta keluar.

<img width="343" height="255" alt="image" src="https://github.com/user-attachments/assets/fedc9327-5203-4955-884a-2b19bf4206e9" />


---

1. Tambah Komputer

User diminta memasukkan nomor komputer, spesifikasi, dan harga per jam. Sebelum data disimpan, harga yang diinput akan dicek dulu lewat class Validasi, kalau harganya tidak lebih dari 0, data tidak akan ditambahkan dan program akan menampilkan pesan error. Jika valid, data baru dibungkus menjadi objek Komputer dan dimasukkan ke ArrayList lewat method tambah().

<img width="440" height="340" alt="image" src="https://github.com/user-attachments/assets/57635721-f5ca-4483-954c-c2f4f2f303db" />


2. Lihat Semua Komputer

Seluruh data komputer yang tersimpan di ArrayList akan ditampilkan satu per satu menggunakan perulangan for, lengkap dengan nomor, spesifikasi, harga per jam, dan status pemakaiannya. Kalau belum ada data sama sekali, program akan memberi tahu bahwa daftar komputer masih kosong.

<img width="485" height="376" alt="image" src="https://github.com/user-attachments/assets/ac614bb0-0e1b-4cb2-8a1a-9799aba6d023" />


3. Ubah Data Komputer

User memasukkan nomor komputer yang ingin diubah beserta spesifikasi dan harga barunya. Program akan mencari data dengan nomor tersebut di dalam ArrayList, jika ditemukan, datanya akan diperbarui, jika tidak, program menampilkan pesan bahwa data tidak ditemukan. Harga baru juga tetap melewati pengecekan Validasi sebelum diterapkan.

<img width="457" height="343" alt="image" src="https://github.com/user-attachments/assets/02c2f9fe-d39b-4c93-9cdf-6bf022b1ac79" />


4. Hapus Komputer

User memasukkan nomor komputer yang ingin dihapus. Jika nomor tersebut ada di dalam ArrayList, datanya akan dihapus dari daftar; kalau tidak ditemukan, program memberi tahu bahwa data dengan nomor tersebut tidak ada.

<img width="428" height="301" alt="image" src="https://github.com/user-attachments/assets/e248ca2d-9bb4-4d38-858e-9a17449e00a4" />


5. Booking Komputer

User memasukkan nomor komputer yang ingin dibooking. Jika komputer tersebut berstatus kosong, statusnya akan diubah menjadi dipakai. Jika komputer sudah dipakai sebelumnya, program akan memberi tahu bahwa komputer tersebut tidak tersedia, dan kalau nomornya tidak ada di daftar, program juga memberi tahu data tidak ditemukan.

<img width="447" height="301" alt="image" src="https://github.com/user-attachments/assets/9e9df3db-b48a-4d31-bf09-352f366ebc4d" />


6. Kosongkan Komputer

User memasukkan nomor komputer yang ingin dikosongkan kembali. Jika komputer tersebut sedang berstatus dipakai, statusnya akan diubah kembali menjadi kosong, sama seperti kondisi awal. Kalau komputernya memang sudah kosong dari awal, program memberi tahu bahwa komputer tersebut memang sedang tidak dipakai.

<img width="475" height="302" alt="image" src="https://github.com/user-attachments/assets/7c05fc33-094d-424f-9e15-2e491c50058b" />


7. Keluar

Program akan menghentikan perulangan while dengan mengubah nilai lanjut menjadi false, sehingga aplikasi berhenti berjalan dan kembali ke sistem operasi.

<img width="331" height="280" alt="image" src="https://github.com/user-attachments/assets/ace00958-097d-4dd9-9106-091bb31a4b75" />

