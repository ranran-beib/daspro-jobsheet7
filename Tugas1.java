import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int totalTiket = 0;
        int inputTiket;

        while (true) {
            System.out.print("Jumlah tiket terjual (input negatif untuk selesai): ");
            inputTiket = sc.nextInt();

            if (inputTiket < 0) {
                break;
            } else if (inputTiket == 0) {
                System.out.println("Jumlah tiket tidak boleh 0, silahkan input kembali.");
                continue;
            } else {
                totalTiket += inputTiket;
            }

        }

        double diskon = 0;
        if (totalTiket > 10) {
            diskon = 0.15;
        } else if (totalTiket > 4) {
            diskon = 0.10;
        }

        double totalHarga = totalTiket * hargaTiket;
        double hargaDiskon = totalHarga - (totalHarga * diskon);

        System.out.println("\nTiket terjual: " + totalTiket);
        System.out.println("Harga tiket per unit: Rp. " + hargaTiket);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total harga setelah diskon: Rp. " + hargaDiskon);

        sc.close();
    }
}