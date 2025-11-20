1.  Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
2.  Mengapa terdapat null pada daftar nama penonton?
3.  Lengkapi daftar penonton pada langkah ke-4 sebagai berikut

    ```java
    penonton[0][0] = "Amin";
    penonton[0][1] = "Bena";
    penonton[1][0] = "Candra";
    penonton[1][1] = "Dela";
    penonton[2][0] = "Eka";
    penonton[2][1] = "Farhan";
    penonton[3][0] = "Gisel";
    penonton[3][1] = "Hana";
    ```

4.  Tambahkan kode program sebagai berikut:

    ```java
    System.out.println(penonton.length);
    System.out.println(penonton[0].length);
    System.out.println(penonton[1].length);
    System.out.println(penonton[2].length);
    System.out.println(penonton[3].length);
    ```

    Jelaskan fungsi dari penonton.length dan penonton[0].length! Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa? 

5.  Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya. 

    ```java
    System.out.println(penonton.length);

    for(int i = 0; i < penonton.length; i++){
        System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
    }
    ```

6.  Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.

    ```java
    System.out.println(penonton.length);

    for(String[] barisPenonton : penonton){
        System.out.println("Panjang baris: " + barisPenonton.length);
    }
    ```

7.  Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya. 

    ```java
    System.out.println("Penonton pada baris  ke-3: ");

    for(int i = 0; i < penonton[2].length; i++){
        System.out.println(penonton[2][i]);
    }
    ```

8.  Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya. 

    ```java
    System.out.println("Penonton pada baris  ke-3: ");

    for(String i : penonton[2]){
        System.out.println(i);
    }
    ```

9.  Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.

    ```java
    for(int i = 0; i < penonton.length; i++){
        System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
    }
    ```

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
11. Berapa indeks baris maksimal untuk array penonton?
12. Berapa indeks kolom maksimal untuk array penonton?
13. Apa fungsi dari String.join()?

Jawaban:

1.  Jawabannya tidak harus, pengisian elemen array dapat dilakukan dari indeks ke berapapun, namun jika pengisiannya tidak berurutan atau dilewati, maka elemen sebelumnya akan bernilai default sesuai tipe data nya.
2.  Karena elemen array indeks terakhir ([3][1]) tidak diisi, maka nilainya akan diisi nilai default, kenapa _null_? karena tipe data array adalah String, jadi nilai default String adalah null.
3.  Done.
4.  penonton.length berfungsi untuk mengukur panjang baris elemen (row) dari sebuah array, sedangkan penonton[0].length berfungsi untuk mengukur panjang kolom elemen pertama/indeks ke-0 (column). penonton[0].length, penonton[1].length, penonton[2].length, penonton[3].length bernilai *sama* yaitu = 2, karena pada saat instansiasi array, bagian kolom diisi 2 elemen.
5.  Output kolom nya tetap sama yaitu 2, namun yang menjadi pembeda adalah terdapat sebuah output String "Panjang baris ke-1" dan seterusnya sebanyak kondisi perulangan, juga penulisan kode menjadi lebih efisien karena menggunakan perulangan.
6.  Sama seperti nomor 5, namun kode saat ini menggunakan foreach loop yang memungkinkan program membaca setiap baris array tanpa perlu menyebutkan indeks secara manual. foreach secara otomatis melakukan iterasi melalui seluruh baris array dan mencetak panjang masing-masing baris, tanpa kita perlu menuliskan penonton[0], penonton[1], dan seterusnya.
7.  Program akan menampilkan output tambahan yaitu "Penonton pada bari ke-3: " yaitu "Eka" dan "Farhan" hal ini dapat terjadi karena terdapat sebuah perulangan yang berfungsi untuk menampilkan seluruh kolom array penonton pada baris indeks ke 2.
8.  Program akan menampilkan output sama seperti nomor 7, namun untuk perulangannya menggunakan foreach yang lebih fleksibel untuk perulangan menggunakan kondisi banyak data.
9.  Kode untuk menampilkan isi array penonton menjadi lebih efisien dan fleksibel karena kita hanya menggunakan perulangan yang kodenya lebih ringkas dibanding menuliskan manual, juga sangat fleksibel karena output yang akan ditampilkan sesuai dengan kondisi yang telah diterapkan, mengurangi risiko kesalahan penulisan indeks array
10. Kelebihan foreach loop adalah lebih fleksibel dan efisien jika ingin melakukan perulangan terhadap array, karena penulisannya lebih sederhana dan ringkas, juga mengurangi risiko error indeks. Kekurangannya adalah tidak dapat mengakses indeks langsung dan lebih susah untuk melakukan kontrol looping seperti skip elemen, lompat indeks, dan lain lain.
11. Indeks maksimal barisnya adalah *3* karena indeks dimulai dari 0.
12. Sedangkan indeks maksimal kolomnya adalah *1* karena indeks dimulai dari 0.
13. Sebelum itu kode perulagan pada percobaan berfungsi untuk menampikan isi dari baris array 2 dimensi, tidak secara spesifik menuju ke elemen nya, jadi fungsi _String.join()_ adalah untuk mengubah array menjadi sebuah String atau teks yang mudah untuk dibaca manusia, juga untuk menghindari output berupa alamat memori dari array. pada _String.join()_ terdapat sebuah delimiter yang mana berfungsi sebagai pemisah setiap elemen array yang akan digabung.