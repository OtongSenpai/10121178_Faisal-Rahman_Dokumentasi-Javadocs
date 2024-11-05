import java.util.Scanner;

/**
 * Kelas BasicCalculator berfungsi sebagai kalkulator sederhana
 * yang mendukung operasi aritmatika penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class BasicCalculator {

    /**
     * Metode utama program yang meminta input dari pengguna, menjalankan operasi aritmatika,
     * serta menampilkan hasil operasi.
     *
     * @param args metode ini tidak memiliki parameter
     */
    public static void main(String[] args) {
        // Deklarasi variabel untuk menyimpan dua angka
        double num1, num2;

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua angka
        System.out.println("Enter the numbers:");
        num1 = sc.nextDouble();  // Membaca angka pertama
        num2 = sc.nextDouble();  // Membaca angka kedua

        // Meminta pengguna untuk memasukkan operator
        System.out.println("Enter the operator (+,-,*,/):");
        char op = sc.next().charAt(0);  // Membaca operator yang dimasukkan oleh pengguna
        double result = 0;  // Variabel untuk menyimpan hasil operasi

        /**
         * Menggunakan switch untuk menentukan operasi berdasarkan input pengguna.
         * Jika operator tidak valid, program akan menampilkan pesan kesalahan.
         */
        switch (op) {
            case '+':
                result = num1 + num2;  // Menjumlahkan dua angka
                break;

            case '-':
                result = num1 - num2;  // Mengurangkan dua angka
                break;

            case '*':
                result = num1 * num2;  // Mengalikan dua angka
                break;

            case '/':
                result = num1 / num2;  // Membagi dua angka
                break;

            default:
                System.out.println("You entered wrong input");  // Pesan kesalahan jika operator tidak valid
                return;
        }

        // Menampilkan hasil akhir dari operasi
        System.out.println("The final result:");
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}
