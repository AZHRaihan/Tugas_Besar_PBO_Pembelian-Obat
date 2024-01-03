package com.example.sipembelianobat.transaksi;

public interface Pembelian {
    double hitungTotalHarga();

    void prosesPembayaran(double totalHarga);
}
