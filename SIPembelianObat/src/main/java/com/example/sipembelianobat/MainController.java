package com.example.sipembelianobat;

import com.example.sipembelianobat.model.Obat;
import com.example.sipembelianobat.transaksi.PembelianObat;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MainController {
    @FXML
    private TextField namaPelangganTextField;

    @FXML
    private TextField alamatPelangganTextField;

    @FXML
    private TextField tanggalPembelianTextField;

    @FXML
    private TextField nomorObatTextField;

    @FXML
    private TextField jumlahObatTextField;

    @FXML
    private void submitButtonAction() {
        String namaPelanggan = namaPelangganTextField.getText().trim();
        String alamatPelanggan = alamatPelangganTextField.getText().trim();
        String tanggalPembelianText = tanggalPembelianTextField.getText().trim();
        String nomorObatText = nomorObatTextField.getText().trim();

        if (namaPelanggan.isEmpty() || alamatPelanggan.isEmpty() || tanggalPembelianText.isEmpty() || nomorObatText.isEmpty()) {
            // Tampilkan popup message jika ada form yang belum diisi
            showAlert("Form belum lengkap", "Harap isi semua kolom form.");
            return;
        }

        Obat obat1 = new Obat("Paracetamol", "Obat Sakit Kepala", 5000, 100);
        Obat obat2 = new Obat("Amoxicillin", "Antibiotik", 10000, 50);
        Obat obat3 = new Obat("Omeprazole", "Obat Maag", 8000, 75);
        Obat obat4 = new Obat("Aspirin", "Analgesik", 6000.0, 80);
        Obat obat5 = new Obat("Cetirizine", "Antihistamin", 10000.0, 60);

        int nomorObat = Integer.parseInt(nomorObatTextField.getText());
        int jumlahPembelian = Integer.parseInt(jumlahObatTextField.getText());

        Obat obatPilihan = null;

        switch (nomorObat) {
            case 1:
                obatPilihan = obat1;
                break;
            case 2:
                obatPilihan = obat2;
                break;
            case 3:
                obatPilihan = obat3;
                break;
            case 4:
                obatPilihan = obat4;
                break;
            case 5:
                obatPilihan = obat5;
                break;
            default:
                System.out.println("Nomor obat tidak valid.");
                return;
        }

        if (jumlahPembelian > obatPilihan.getStok()) {
            System.out.println("Jumlah obat yang dibeli melebihi stok yang tersedia.");
            return;
        }

        PembelianObat pembelian1 = new PembelianObat(tanggalPembelianText, obatPilihan, jumlahPembelian);

        if (obatPilihan != null) {
            obatPilihan.setStok(obatPilihan.getStok() - pembelian1.getJumlah());
            pembelian1.cetakTransaksi();

            // Menampilkan hasil transaksi pada halaman baru
            showResultPage(pembelian1);
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void showResultPage(PembelianObat pembelian) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Result.fxml"));
            Parent root = loader.load();

            ResultController resultController = loader.getController();
            resultController.setResult(
                    "Transaksi Pembelian Obat\n" +
                            "Tanggal: " + pembelian.getTanggal() + "\n" +
                            "Obat: " + pembelian.getObat().getNama() + "\n" +
                            "Jumlah: " + pembelian.getJumlah() + "\n" +
                            "Total Harga: Rp " + pembelian.getTotalHarga() + "\n" +
                            "Stok Obat Tersisa: " + pembelian.getObat().getStok() + "\n" +
                            "Jenis Obat: " + pembelian.getObat().getJenis()
            );

            Stage resultStage = new Stage();
            resultStage.setTitle("Hasil Transaksi");
            resultStage.setScene(new Scene(root, 400, 300));
            resultStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
