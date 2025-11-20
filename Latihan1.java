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

        int jmlSiswa, tempRata = 0;

        System.out.print("Masukan jumlah mahasiswa: ");
        jmlSiswa = sc.nextInt();
        sc.nextLine();

        double rata[] = new double[jmlSiswa];
        int nilai[][] = new int[jmlSiswa][3];

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Mahasiswa ke-" + i + ", Masukan nilai matkul ke-" + j + " : ");
                nilai[i][j] = sc.nextInt();
                tempRata += nilai[i][j];
            }
            rata[i] = tempRata / 3;
            tempRata = 0;
            System.out.println("Rata-rata nilai : " + rata[i] + "\n");
        }

        for (int i = 0; i < rata.length; i++) {
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " : " + rata[i]);
        }

        sc.close();
    }
}
