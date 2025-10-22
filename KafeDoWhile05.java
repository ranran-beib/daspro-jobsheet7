import java.util.Scanner;

public class KafeDoWhile05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String nama;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;

        do {
            System.out.print("Nama Pelanggan (ketik 'batal' untuk keluar): ");
            nama = sc.nextLine();

            if (nama.equalsIgnoreCase ("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.println("Jumlah pesanan kopi: ");
            kopi = sc.nextInt();

            System.out.println("Jumlah pesanan teh: ");
            teh = sc.nextInt();

            System.out.println("Jumlah pesanan roti: ");
            roti = sc.nextInt();
            sc.nextLine();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang dibayarakan: Rp. " + totalHarga);
            System.out.println();

        } while (true);
        
        System.out.println("Transaksi selesai.");
        sc.close();
    }
}