import java.util.Scanner;

public class UKL2 {
    public static void main(String[] args) {
        int bilangan1, bilangan2, hasil;
        char operator;
        boolean lanjut = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Kuis meliputi operasi perkalian (*), pembagian (/), dan modulus (%)");
        while (lanjut) {
            bilangan1 = (int) (Math.random() * 10) + 1; 
            bilangan2 = (int) (Math.random() * 10) + 1; 

            int pilihOperator = (int) (Math.random() * 3);
            if (pilihOperator == 0) {
                operator = '*';
                hasil = bilangan1 * bilangan2;
            } else if (pilihOperator == 1) {
                operator = '/';
            
                hasil = bilangan1 / bilangan2;
            } else {
                operator = '%';
                hasil = bilangan1 % bilangan2;
            }

            System.out.println("Soal: " + bilangan1 + " " + operator + " " + bilangan2 + " = ?");
            System.out.print("Jawaban Anda: ");
            int jawabanUser  = input.nextInt();

            // mengecek jwbn
            if (jawabanUser  == hasil) {
                System.out.println("Jawaban Anda BENAR!");
            } else {
                System.out.println("Jawaban Anda SALAH! Jawaban yang benar adalah: " + hasil);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String pilihan = input.next();

            if (pilihan.equalsIgnoreCase("tidak")) {
                lanjut = false;
                System.out.println("Terima kasih telah bermain!");
            }
        }
        input.close();
    }
}