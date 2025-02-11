import java.util.Scanner;

public class UAS {

    static String[] mobil = {"Avanza", "Civic", "Swift", "X5", "Mercedes Benz", "Almaz"};
    static String[] tipe = {"Toyota", "Honda", "Suzuki", "BMW", "Mercedes", "wuling"};
    static int[] hargaSewa = {300000, 350000, 400000, 800000, 1000000, 1200000};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Sewa Mobil:");
            System.out.println("1. Cari Mobil");
            System.out.println("2. Tampilkan Daftar Mobil");
            System.out.println("3. Sewa Mobil");
            System.out.println("4. Urut Mobil berdasarkan Harga");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    cariMobil(scanner);
                    break;
                case 2:
                    tampilkanMobil();
                    break;
                case 3:
                    sewaMobil(scanner);
                    break;
                case 4:
                    urutkanMobilBerdasarkanHarga();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    public static void cariMobil(Scanner scanner) {
        System.out.print("Masukkan nama mobil yang ingin dicari: ");
        scanner.nextLine(); // Clear buffer
        String cari = scanner.nextLine().toLowerCase();
        boolean ditemukan = false;

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].toLowerCase().contains(cari)) {
                System.out.println("Mobil ditemukan dengan tipe: " + tipe[i]);
                System.out.println("Mobil ditemukan: " + mobil[i]);
                System.out.println("Harga sewa : Rp " + hargaSewa[i] + "/per hari");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mobil tidak ditemukan.");
        }
    }
        
    public static void tampilkanMobil() {
        System.out.println("===================================================================================");
        System.out.println("Daftar Mobil yang Tersedia di Garage kami:");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println((i+1) + ". Merek Mobil: " + tipe[i] + " | Tipe Mobil: " + mobil[i] + " | Harga: Rp" + hargaSewa[i] + "/per Hari");
        }
        System.out.println("===================================================================================");
    }

    public static void urutkanMobilBerdasarkanHarga() {
        int n = hargaSewa.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (hargaSewa[j] > hargaSewa[j + 1]) {
                    // Tukar harga
                    int tempHarga = hargaSewa[j];
                    hargaSewa[j] = hargaSewa[j + 1];
                    hargaSewa[j + 1] = tempHarga;
                    
                    // Tukar nama mobil
                    String tempMobil = mobil[j];
                    mobil[j] = mobil[j + 1];
                    mobil[j + 1] = tempMobil;
                    
                    // Tukar tipe mobil
                    String tempTipe = tipe[j];
                    tipe[j] = tipe[j + 1];
                    tipe[j + 1] = tempTipe;
                }
            }
        }
        System.out.println("Mobil Sudah diurutkan berdasarkan harga.");
        tampilkanMobil();
    }

    public static void sewaMobil(Scanner scanner) {
        tampilkanMobil();
        System.out.print("Pilih mobil yang ingin disewa (1-" + mobil.length + "): ");
        int pilihan = scanner.nextInt();
        
        if (pilihan < 1 || pilihan > mobil.length) {
            System.out.println("Pilihan tidak valid.");
        } else {
            System.out.print("Berapa hari Anda ingin sewa? ");
            int hari = scanner.nextInt();
            int totalHarga = hargaSewa[pilihan - 1] * hari;
            System.out.println("Total harga sewa " + mobil[pilihan - 1] + " selama " + hari + " hari: Rp" + totalHarga);
            
            System.out.print("Apakah Anda ingin melanjutkan pembayaran? (y/n): ");
            scanner.nextLine(); // Clear buffer
            String konfirmasi = scanner.nextLine();
            
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Masukkan Nama Bank Anda: ");
                scanner.nextLine();
                System.out.print("Masukkan Nomor rekening Anda: ");
                scanner.nextLine();
                System.out.print("Silahkan Masukkan nominal uang Anda: ");
                double nominalUang = scanner.nextDouble();
            
              if (nominalUang >= totalHarga) {
                    double kembalian = nominalUang - totalHarga;
                    System.out.println("Pembayaran berhasil! Terima kasih telah menyewa mobil di DIKI_RENTAL_CAR.");
                    if (kembalian > 0) {
                        System.out.println("Kembalian Anda: Rp" + kembalian);
                    }
                } else {
                    System.out.println(" Mohon Maaf, uang yang Anda masukkan tidak mencukupi. Transaksi dibatalkan.");
                }
            } else {
                System.out.println("Pembayaran dibatalkan.");
            }
        }
    }
}