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


## Cara menjalankan Program
1. jalankan program di file main.java
2. isi inputan dengan mengikuti instruksi pada layar


## Hasil Running
![Screenshot 2024-01-03 184450](https://github.com/AZHRaihan/Tugas_Besar_PBO_Pembelian-Obat/assets/145973780/d98b16d8-72f4-456b-ba6f-df9d4a44cbcc)
![Screenshot 2024-01-03 184509](https://github.com/AZHRaihan/Tugas_Besar_PBO_Pembelian-Obat/assets/145973780/2f75e93c-3ddc-43f8-ba76-7673eaa1483b)
![Screenshot 2024-01-03 185453](https://github.com/AZHRaihan/Tugas_Besar_PBO_Pembelian-Obat/assets/145973780/0b3ca98a-b4cf-4500-b196-f22f55d08741)
