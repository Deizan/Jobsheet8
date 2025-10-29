import java.util.Scanner;

public class RataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai N = ");
        int n = sc.nextInt();
        int i = 1;
        int j = 1;
        float nilai = 0, totalNilai = 0, rataNilai = 0;
        int nilaiMHS = 0;
        for (i=1; i<=5; i++) {
            System.out.print("Masukkan Nilai ke-"+i+" = ");
            nilaiMHS = sc.nextInt();
            totalNilai += nilaiMHS;
        }
        rataNilai = totalNilai/ 5;
        System.out.println("Rata-rata Nilai = " + rataNilai);

        j=1;
        while (j<=5) {
            totalNilai = 0;
            for(j=1; j<=5; j++) {
                System.out.print("Masukkan Nilai ke-" +j +" = ");
                nilaiMHS = sc.nextInt();
                totalNilai += nilaiMHS;
            }
            rataNilai = totalNilai/5;
            j++;
        }
    }


}

