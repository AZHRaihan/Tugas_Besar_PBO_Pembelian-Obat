# Tugas_Besar_PBO_Pembelian-Obat

## SI Pembelian Obat
Program sederhana ini dibuat untuk melakukan pembelian dan penjualan obat. Didalam program ini pengguna dapat membeli obat dengan antarmuka yang mudah digunakan.

## Identifikasi Masalah
Program ini merupakan aplikasi sederhana untuk melakukan transaksi pembelian obat di sebuah toko. Masalah yang ingin diatasi adalah proses pencatatan dan pengelolaan pembelian obat oleh pelanggan. Program ini memungkinkan pengguna untuk memasukkan data pelanggan, memilih obat yang ingin dibeli, serta mencetak transaksi pembelian obat.

## Fitur Yang Ada Dalam Program Ini
1. Pencatatan informasi Pelanggan
2. Pencatatan Informasi Obat
3. Pencatatan stok obat
4. Pembelian obat
5. Mencetak Transaksi

## Pihak Terlibat
1. Apoteker
2. Pelanggan

## Data yang disimpan dan diolah
- Informasi Obat (Nama Obat, Jenis Obat, Harga, Stok)
- Informasi Pelanggan ( Nama, Alamat)
- Informasi Transaksi (Tanggal, Obat yang dibeli, jumlah, total harga, stok obat yang tersisa setelah Pembelian)

## Model Class
![Screenshot 2024-01-03 160841](https://github.com/AZHRaihan/Tugas_Besar_PBO_Pembelian-Obat/assets/145973780/a5b46832-b746-494b-ae1a-afa31aeec3b1)

### Turunan/ Relasi/ Abstraksi/ Interface
### 1. Pembelian (Interface):
Atribut:
Tidak memiliki atribut, karena pada dasarnya sebuah interface tidak memiliki variabel instance.
Metode:
hitungTotalHarga(): Metode untuk menghitung total harga pembelian.
prosesPembayaran(double totalHarga): Metode untuk melakukan proses pembayaran.

### 2. Transaksi (Kelas Abstrak):
Atribut:
tanggal: Menyimpan tanggal transaksi.
obat: Menyimpan obat yang dibeli.
jumlah: Menyimpan jumlah obat yang dibeli.
totalHarga: Menyimpan total harga transaksi.
Metode:
getTanggal(): Mengembalikan tanggal transaksi.
getObat(): Mengembalikan obat yang dibeli.
getJumlah(): Mengembalikan jumlah obat yang dibeli.
getTotalHarga(): Mengembalikan total harga transaksi.
setTotalHarga(double totalHarga): Menetapkan nilai total harga transaksi.

### 3. PembelianObat (Kelas Turunan dari Transaksi dan Implementasi Pembelian):
Atribut:
Mewarisi atribut tanggal, obat, jumlah, dan totalHarga dari kelas Transaksi.
Metode:
Mewarisi metode getTanggal(), getObat(), getJumlah(), getTotalHarga(), dan setTotalHarga(double totalHarga) dari kelas Transaksi.
hitungTotalHarga(): Implementasi dari metode interface Pembelian untuk menghitung total harga pembelian obat.
prosesPembayaran(double totalHarga): Implementasi dari metode interface Pembelian untuk melakukan proses pembayaran.

## Skenario program
### Pengguna Memasukkan Data Pelanggan:
Pengguna membuka aplikasi.
Pengguna mengisi formulir dengan informasi pelanggan, termasuk nama, alamat, dan tanggal pembelian.
Pengguna mengklik tombol "Submit" setelah mengisi formulir.

### Pengguna Memilih Obat yang Ingin Dibeli:
Setelah formulir pelanggan diisi, pengguna memasukkan nomor obat yang ingin dibeli dan jumlahnya.
Pengguna memastikan bahwa nomor obat yang dimasukkan valid (1-5).
Pengguna mengklik tombol "Submit" lagi.

### Validasi Stok Obat:
Program melakukan validasi untuk memastikan jumlah obat yang diminta tidak melebihi stok yang tersedia.
Jika jumlah obat melebihi stok, program menampilkan pesan di konsol dan transaksi dibatalkan.

### Pencatatan dan Pengurangan Stok Obat:
Jika jumlah obat valid, program mencatat transaksi pembelian obat.
Stok obat yang tersedia dikurangi sesuai dengan jumlah obat yang dibeli.

### Cetak Transaksi:
Program mencetak informasi transaksi, termasuk tanggal, obat yang dibeli, jumlah, total harga, stok obat tersisa, dan jenis obat di konsol.

### Tampilan Hasil Transaksi:
Program menampilkan hasil transaksi pada halaman baru.
Pengguna dapat melihat detail transaksi seperti tanggal, obat yang dibeli, jumlah, total harga, stok obat tersisa, dan jenis obat.

### Alert Formulir Belum Lengkap:
Jika pengguna tidak mengisi semua kolom pada formulir, program menampilkan popup alert yang memberi tahu bahwa formulir belum lengkap.

### Alert Jumlah Obat Melebihi Stok:
Jika jumlah obat yang diminta melebihi stok, program menampilkan pesan di konsol yang memberitahu pengguna bahwa transaksi dibatalkan.

### Penanganan Nomor Obat Tidak Valid:
Jika pengguna memasukkan nomor obat yang tidak valid (lebih dari 5 atau kurang dari 1), program menampilkan pesan di konsol.

### Pembayaran (Cetak ke Konsol):
Program mencetak informasi pembayaran (hanya menampilkan di konsol) dengan jumlah yang harus dibayar berdasarkan total harga transaksi.

### Pengguna Melakukan Transaksi Lain:
Pengguna dapat kembali ke langkah 2 untuk melakukan transaksi pembelian obat lainnya.
Pengguna dapat menutup aplikasi setelah melakukan sejumlah transaksi.

## Cara menjalankan Program
1. jalankan program di file main.java
2. isi inputan dengan mengikuti instruksi pada layar


## Hasil Running
![Screenshot 2024-01-03 184450](https://github.com/AZHRaihan/Tugas_Besar_PBO_Pembelian-Obat/assets/145973780/d98b16d8-72f4-456b-ba6f-df9d4a44cbcc)
![Screenshot 2024-01-03 184509](https://github.com/AZHRaihan/Tugas_Besar_PBO_Pembelian-Obat/assets/145973780/2f75e93c-3ddc-43f8-ba76-7673eaa1483b)
![Screenshot 2024-01-03 185453](https://github.com/AZHRaihan/Tugas_Besar_PBO_Pembelian-Obat/assets/145973780/0b3ca98a-b4cf-4500-b196-f22f55d08741)
