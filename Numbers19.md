1.  Tambahkan kode program sebagai berikut:

    ```java
        for(int i = 0; i < myNumbers.length; i++){
            System.out.println(Arrays.toString(myNumbers[i]));
        }
    ```

2.  Apa fungsi dari Arrays.toString()? 
3.  Apa nilai default untuk elemen pada array dengan tipe data int? 
4.  Tambahkan kode program berikut:

    ```java
        for(int i = 0; i < myNumbers.length; i++){
            System.out.println("Panjang baris ke-" + (i + 1) + ": " +  myNumbers[i].length);
        }
    ```

5.  Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi? 


Jawaban:

1.  DONE
2.  Fungsi dari _Arrays.toString()_ adalah untuk mengubah array menjadi sebuah string atau teks yang mudah dibaca oleh manusia, fungsi ini juga dapat menghindari output alamat memori dari sebuah array
3.  nilai default dari elemen Array dengan tipe data int adalah *0*
4.  DONE
5.  jawabannya tidak bisa, jika array sudah diinstansiasi maka panjang array tidak dapat diubah, karena length itu fixed atau tidak dapat diubah.