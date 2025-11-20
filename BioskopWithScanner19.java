import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu, jarakBaris = 4;
        String nama, next, penonton[][] = new String[4][2];

        while (true) {
            System.out.println("Selamat Datang!  ");
            System.out.println("[1] Input data Penonton\n[2] Tampilkan daftar penonton\n[3] Exit");
            System.out.print("Silahkan pilih menu:  ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.println("=".repeat(50));
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (maks: " + penonton.length + ") : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (maks: " + penonton[0].length + ") : ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if(baris > penonton.length || kolom > penonton[0].length){
                        System.out.println("Kursi tidak tersedia, silahkan inputkan ulang!");
                        continue;
                    }
                    if(penonton[baris-1][kolom-1] != null){
                        System.out.println("Kursi telah dipesan, silahkan pilih kursi yang lain!");
                        continue;
                    }
                    penonton[baris-1][kolom-1] = nama;
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    
                    if (next.equalsIgnoreCase("n")) {
                        System.out.println("=".repeat(50));
                        break;
                    }
                }
            } else if (menu == 2) {
                //
                // NYOBA NGULIK BUAT TAMPILAN SEPERTI TABEL IBU🙏
                // MOHON MAAF KALAU BERANTAKAN KODE NYA IBU
                //
                System.out.println("=".repeat(50));
                System.out.println("Daftar Penonton:\n");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            if (penonton[i][j].length() > jarakBaris) {
                                jarakBaris = penonton[i][j].length();
                            }
                        }
                    }
                }
                for (int i = 0; i < penonton[0].length; i++) {
                    System.out.printf("%"+ (jarakBaris/2+2) +"s %d %" + (jarakBaris/4) + "s", "", (i + 1), "");
                }
                System.out.println();
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("-".repeat((jarakBaris * penonton[0].length) + 8));
                    System.out.print((i + 1) + "| ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        //TAMPILAN ISI ARRAY DISINI
                        System.out.printf("%-" + jarakBaris +"s | ", penonton[i][j] != null ? penonton[i][j] : "***");
                    }
                    System.out.println();
                }
                System.out.println("-".repeat((jarakBaris * penonton[0].length) + 8 ) + "\n");
                System.out.println("=".repeat(50));
            } else if (menu == 3) {
                break;
            } else{
                System.out.println("-".repeat(50));
                System.out.println("Pilihan tidak valid! Silahkan ulangi");
                System.out.println("-".repeat(50));
                continue;
            }

        }
        sc.close();



    }
}