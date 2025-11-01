import java.util.Scanner;

public class Tugas2Jobsheet8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sports = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = input.nextInt();
        input.nextLine(); 
        
        for (int i = 1; i <= jumlahPeserta; i++) {
            System.out.println("Data Peserta ke-" + i);
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            
            System.out.println("Pilih cabang olahraga:");
            for (int j = 0; j < sports.length; j++) {
                System.out.println((j + 1) + ". " + sports[j]);
            }
            
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = input.nextInt();
            input.nextLine(); 
            
            if (pilihan >= 1 && pilihan <= 4) {
                System.out.println("Data yang dimasukkan:");
                System.out.println("Nama: " + nama);
                System.out.println("Cabang Olahraga: " + sports[pilihan - 1]);
            } else {
                System.out.println("Pilihan tidak valid!");
                i--; 
            }
        }
        
        input.close();
    }
}

