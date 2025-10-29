import java.util.Scanner;

public class Square16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
                System.out.print("*");
            for (int s = 1; s < n; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
    
