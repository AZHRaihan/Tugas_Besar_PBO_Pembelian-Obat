package com.example.sipembelianobat.model;

public class Obat {
    private String nama;
    private String jenis;
    private double hargaPerUnit;
    private int stok;

    // Konstruktor
    public Obat(String nama, String jenis, double hargaPerUnit, int stok) {
        this.nama = nama;
        this.jenis = jenis;
        this.hargaPerUnit = hargaPerUnit;
        this.stok = stok;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHargaPerUnit() {
        return hargaPerUnit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}