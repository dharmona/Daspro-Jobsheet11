import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * SOAL 2 — Peta Inventaris Gudang (Menengah)
 * 
 * Sebuah gudang dibagi menjadi 5 baris × 5 kolom rak.
 * Setiap posisi rak menyimpan jumlah barang tertentu.
 * 
 * Buat program untuk:
 * 
 * Menginput data barang dalam array 2D 5×5.
 * 
 * Menampilkan total barang di:
 * 
 * Seluruh gudang
 * 
 * Setiap baris
 * 
 * Setiap kolom
 * 
 * Menampilkan lokasi rak dengan jumlah barang terbanyak (baris & kolom).
 * 
 * Ilustrasi array 2D:
 * gudang[row][col] = jumlah barang
 * 
 * Baris = Vertikal(Y)
 * Kolom = Horizontal(X)
 */
public class Latihan2 {
    private static final int ROWS = 5;
    private static final int COLS = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] gudang = new int[ROWS][COLS];

        int maxBarang = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;

        // === Input data gudang ===
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                System.out.printf("Masukan jumlah barang di rak [row %d][col %d]: ", row, col);
                gudang[row][col] = sc.nextInt();

                if (gudang[row][col] > maxBarang) {
                    maxBarang = gudang[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
            System.out.println();
        }

        System.out.println("=== DATA BARANG PER BARIS ===");
        // === Tampilkan semua baris ===
        for (int row = 0; row < ROWS; row++) {
            String items = Arrays.stream(gudang[row])
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.printf("Baris %d: %s%n", row, items);
        }

        System.out.println("\n=== TOTAL PER BARIS ===");
        // === Total barang tiap baris ===
        for (int row = 0; row < ROWS; row++) {
            int sumRow = Arrays.stream(gudang[row]).sum();
            System.out.printf("Total baris %d: %d%n", row, sumRow);
        }

        System.out.println("\n=== TOTAL PER KOLOM ===");
        // === Total barang tiap kolom ===
        for (int col = 0; col < COLS; col++) {
            int sumCol = 0;
            for (int row = 0; row < ROWS; row++) {
                sumCol += gudang[row][col];
            }
            System.out.printf("Total kolom %d: %d%n", col, sumCol);
        }

        System.out.println("\n=== TOTAL BARANG DI SELURUH GUDANG ===");
        int totalGudang = Arrays.stream(gudang)
                .flatMapToInt(Arrays::stream)
                .sum();
        System.out.println("Total seluruh gudang: " + totalGudang);

        System.out.println("\n=== RAK DENGAN BARANG TERBANYAK ===");
        System.out.printf("Jumlah barang : %d%n", maxBarang);
        System.out.printf("Lokasi        : row %d, col %d%n", maxRow, maxCol);

        sc.close();
    }
}