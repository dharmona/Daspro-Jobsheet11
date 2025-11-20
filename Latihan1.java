import java.util.Arrays;
import java.util.Scanner;

/**
 * SOAL 1 — Penilaian Kuis Siswa (Mudah)
 * 
 * Sebuah kelas mengikuti 3 kali kuis. Terdapat N siswa.
 * Buatlah program Java untuk:
 * 
 * Menginput jumlah siswa N.
 * 
 * Menginput nilai kuis untuk tiap siswa dalam bentuk array 2D berukuran N x 3.
 * 
 * Menampilkan:
 * 
 * Nilai setiap siswa
 * 
 * Rata-rata nilai tiap siswa
 * 
 * Contoh bentuk data (array 2D):
 * scores[i][j] = nilai siswa ke-i pada kuis ke-j
 */
public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jmlSiswa = sc.nextInt();
        int[][] scores = new int[jmlSiswa][3];

        for (int i = 0; i < jmlSiswa; i++) {
            System.out.println("Input nilai kuis untuk siswa ke-" + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai kuis ke-" + (j + 1) + ": ");
                scores[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < jmlSiswa; i++) {
            System.out.println("Nilai siswa ke-" + (i + 1) + ": " + Arrays.toString(scores[i]));
            double rataRata = Arrays.stream(scores[i]).average().orElse(0);
            System.out.printf("Rata-rata nilai: %.2f\n", rataRata);
            System.out.println();
        }
        sc.close();
    }
}
