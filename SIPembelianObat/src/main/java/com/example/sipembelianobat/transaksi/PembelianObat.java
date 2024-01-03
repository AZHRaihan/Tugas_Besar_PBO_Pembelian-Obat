package com.example.sipembelianobat.transaksi;

import com.example.sipembelianobat.model.Obat;

public class PembelianObat extends Transaksi implements Pembelian {

    public PembelianObat(String tanggal, Obat obat, int jumlah) {
        super(tanggal, obat, jumlah, 0);  // Ubah nilai totalHarga menjadi 0
    }

    @Override
    public double hitungTotalHarga() {
        double totalHarga = getJumlah() * getObat().getHargaPerUnit();  // Hitung totalHarga
        setTotalHarga(totalHarga);  // Set nilai totalHarga
        return getTotalHarga();
    }

    @Override
    public void prosesPembayaran(double totalHarga) {
        System.out.println("Pembayaran sejumlah: Rp " + totalHarga);
    }

    public void cetakTransaksi() {
        hitungTotalHarga();  // Hitung totalHarga sebelum mencetak transaksi
        System.out.println("\nTransaksi Pembelian Obat");
        System.out.println("Tanggal: " + getTanggal());
        System.out.println("Obat: " + getObat().getNama());
        System.out.println("Jumlah: " + getJumlah());
        System.out.println("Total Harga: Rp " + getTotalHarga());  // Output totalHarga yang sudah dihitung
        System.out.println("Stok Obat Tersisa: " + getObat().getStok());
        System.out.println("Jenis Obat: " + getObat().getJenis());
    }
}
