import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        // Harga barang per item
        double hargaBarang = 50.0;

        // Meminta pengguna memasukkan jumlah barang yang dibeli
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Menghitung total harga tanpa diskon
        double totalHarga = jumlahBarang * hargaBarang;

        // Menghitung diskon berdasarkan jumlah barang yang dibeli
        double diskon = 0.0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05; // Diskon 5%
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.1; // Diskon 10%
        } else if (jumlahBarang > 20) {
            diskon = 0.2; // Diskon 20%
        }

        // Menghitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Menampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: Rp " + totalHargaSetelahDiskon);

        // Menutup scanner
        scanner.close();

    }
}