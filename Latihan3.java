import java.util.Scanner;

/**
 * SOAL 3 — Analisis Suhu Harian Kota (Sulit)
 * 
 * Terdapat 7 kota, dan setiap kota memiliki data suhu selama 4 hari.
 * 
 * Gunakan array 2D ukuran 7 × 4 untuk menyimpan datanya.
 * Program harus:
 * 
 * Menginput suhu masing-masing kota.
 * 
 * Menampilkan:
 * 
 * Rata-rata suhu tiap kota
 * 
 * Rata-rata suhu tiap hari (kolom)
 * 
 * Kota dengan suhu rata-rata tertinggi
 * 
 * Hari mana yang paling panas rata-ratanya
 * 
 * Contoh struktur:
 * suhu[kota][hari]
 */
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ukuran: 7 kota x 4 hari
        final int NUM_KOTA = 7;
        final int NUM_HARI = 4;

        int[][] suhu = new int[NUM_KOTA][NUM_HARI];

        // untuk menyimpan suhu tertinggi/terendah (nilai absolut)
        int maxTemp = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;
        int maxTempKota = -1, maxTempHari = -1;
        int minTempKota = -1, minTempHari = -1;

        // Input suhu sekaligus cari max/min absolut
        for (int i = 0; i < NUM_KOTA; i++) {
            for (int j = 0; j < NUM_HARI; j++) {
                System.out.print("Masukan suhu kota ke-" + i + ", Hari ke-" + j + " : ");
                suhu[i][j] = sc.nextInt();

                if (suhu[i][j] > maxTemp) {
                    maxTemp = suhu[i][j];
                    maxTempKota = i;
                    maxTempHari = j;
                }
                if (suhu[i][j] < minTemp) {
                    minTemp = suhu[i][j];
                    minTempKota = i;
                    minTempHari = j;
                }
            }
            System.out.println();
        }

        System.out.println();

        // Rata-rata tiap kota, dan cari kota dengan rata-rata tertinggi/terendah
        double bestCityAvg = Double.NEGATIVE_INFINITY;
        int bestCityIdx = -1;
        double worstCityAvg = Double.POSITIVE_INFINITY;
        int worstCityIdx = -1;

        System.out.println("Rata-rata suhu tiap kota:");
        for (int i = 0; i < NUM_KOTA; i++) {
            double sum = 0;
            for (int j = 0; j < NUM_HARI; j++) {
                sum += suhu[i][j];
            }
            double avg = sum / NUM_HARI;
            System.out.printf("Kota %d: %.2f%n", i, avg);

            if (avg > bestCityAvg) {
                bestCityAvg = avg;
                bestCityIdx = i;
            }
            if (avg < worstCityAvg) {
                worstCityAvg = avg;
                worstCityIdx = i;
            }
        }

        System.out.println();

        // Rata-rata tiap hari, dan cari hari dengan rata-rata tertinggi/terendah
        double bestDayAvg = Double.NEGATIVE_INFINITY;
        int bestDayIdx = -1;
        double worstDayAvg = Double.POSITIVE_INFINITY;
        int worstDayIdx = -1;

        System.out.println("Rata-rata suhu tiap hari:");
        for (int j = 0; j < NUM_HARI; j++) {
            double sum = 0;
            for (int i = 0; i < NUM_KOTA; i++) {
                sum += suhu[i][j];
            }
            double avg = sum / NUM_KOTA;
            System.out.printf("Hari %d: %.2f%n", j, avg);

            if (avg > bestDayAvg) {
                bestDayAvg = avg;
                bestDayIdx = j;
            }
            if (avg < worstDayAvg) {
                worstDayAvg = avg;
                worstDayIdx = j;
            }
        }

        System.out.println();
        System.out.println("Menampilkan data statistik");
        System.out.println("Suhu tertinggi (nilai absolut) : " + maxTemp + " (Kota " + maxTempKota + ", Hari " + maxTempHari + ")");
        System.out.println("Suhu terendah (nilai absolut)  : " + minTemp + " (Kota " + minTempKota + ", Hari " + minTempHari + ")");
        System.out.println("Kota dengan suhu rata-rata tertinggi : Kota " + bestCityIdx + " (rata-rata = " + String.format("%.2f", bestCityAvg) + ")");
        System.out.println("Kota dengan suhu rata-rata terendah  : Kota " + worstCityIdx + " (rata-rata = " + String.format("%.2f", worstCityAvg) + ")");
        System.out.println("Hari paling panas rata-ratanya       : Hari " + bestDayIdx + " (rata-rata = " + String.format("%.2f", bestDayAvg) + ")");
        System.out.println("Hari paling dingin rata-ratanya      : Hari " + worstDayIdx + " (rata-rata = " + String.format("%.2f", worstDayAvg) + ")");

        sc.close();
    }
}
