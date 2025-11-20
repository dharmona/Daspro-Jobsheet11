import java.util.Scanner;

public class Siakad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlSiswa, jmlMatkul;
        System.out.print("Masukkan jumlah siswa: ");
        jmlSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah matkul: ");
        jmlMatkul = sc.nextInt();
        int nilai[][] = new int[jmlSiswa][jmlMatkul];
        System.out.println("=".repeat(50));
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("\tNilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.printf("%s %.1f\n", "Nilai rata-rata: ", (totalPerSiswa / nilai[i].length));
            System.out.println("-".repeat(50));
        }
        System.out.println("=".repeat(50));
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.printf("%s %d : %.1f\n", "Mata Kuliah", (j + 1), totalPerMatkul / nilai.length);
        }
        sc.close();
    }
}