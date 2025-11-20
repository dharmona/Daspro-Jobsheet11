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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int topTier = 0, xTopTier = -1, yTopTier = -1;
        int gudang[][] = new int[5][5];

        for (int i = 0; i < gudang.length; i++) {
            for (int j = 0; j < gudang[0].length; j++) {
                System.out.print("Masukan jumlah barang di rak baris ke-" + i + ", kolom ke-" + j + " : ");
                gudang[i][j] = sc.nextInt();
                if (gudang[i][j] > topTier) {
                    topTier = gudang[i][j];
                    xTopTier = j;
                    yTopTier = i;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < gudang.length; i++) {
            String joined = Arrays.stream(gudang[i])
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.println("Jumlah barang pada baris ke-" + (i + 1) + ": " + joined);
        }

        System.out.println("\nRak dengan jumlah barang terbanyak");
        System.out.println("Jumlah barang : " + topTier);
        System.out.println("Lokasi rak baris ke-" + xTopTier + " kolom ke-" + yTopTier);

        sc.close();
    }
}
