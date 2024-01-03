package com.example.sipembelianobat.transaksi;

import com.example.sipembelianobat.model.Obat;

public class Transaksi {
    private String tanggal;
    private Obat obat;
    private int jumlah;
    private double totalHarga;

    public Transaksi(String tanggal, Obat obat, int jumlah, double totalHarga) {
        this.tanggal = tanggal;
        this.obat = obat;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
    }

    // getter, setter, dan lain-lain sesuai kebutuhan
    public String getTanggal() {
        return tanggal;
    }

    public Obat getObat() {
        return obat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
}
