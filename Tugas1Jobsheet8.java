import java.util.Scanner;
public class Tugas1Jobsheet8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan nilai N (tinggi & lebar): ");
        int N = sc.nextInt();
        System.out.print("masukkan angka yang ditampilkan: ");
        int P = sc.nextInt();
        
        for(int i = 1; i <= N;i++){
            for(int j = 1; j <= N;j++){
                if (i >=2 && i <= N-1 && j >= 2 && j <= N-1){
                    System.out.print("  ");
                    continue;
                    }
                System.out.print(" " +P);
            }
            System.out.println();
        }
    }
    }