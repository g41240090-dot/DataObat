import java.util.Scanner;

public class DataObat {
    public static void main(String[] args) {
        // Mendeklarasikan ukuran matriks
        try (Scanner scanner = new Scanner(System.in)) {
            // Mendeklarasikan ukuran matriks
            int jumlahObat = 3; // Misalkan kita memiliki 3 jenis obat
            String[][] dataObat = new String[jumlahObat][3]; // [][0] untuk nama, [][1] untuk jumlah, [][2] untuk harga
            // Input data obat
            for (int i = 0; i < jumlahObat; i++) {
                System.out.println("Obat ke-" + (i + 1) + ":");
                System.out.print("Masukkan nama obat: ");
                dataObat[i][0] = scanner.nextLine();
                
                System.out.print("Masukkan jumlah stok: ");
                dataObat[i][1] = scanner.nextLine();
                
                System.out.print("Masukkan harga per unit: ");
                dataObat[i][2] = scanner.nextLine();
            }   // Menampilkan data obat yang dimasukkan
            System.out.println("\nData Obat:");
            System.out.printf("%-20s %-10s %-10s\n", "Nama Obat", "Jumlah", "Harga");
            for (int i = 0; i < jumlahObat; i++) {
                System.out.printf("%-20s %-10s %-10s\n",
                        dataObat[i][0], dataObat[i][1], dataObat[i][2]);
            }
            // Menutup scanner
        } // Misalkan kita memiliki 3 jenis obat
    }
}