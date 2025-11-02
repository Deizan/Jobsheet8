import java.util.Scanner;

public class Tugas1Jobsheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, d, n1, n2;

        do {
            System.out.print("Masukkan nilai n pertama (minimal 3): ");
            n1 = sc.nextInt();
        } while (n1 < 3);

        do {
            System.out.print("Masukkan nilai n kedua (minimal 3): ");
            n2 = sc.nextInt();
        } while (n2 < 3);

        int maxRows = Math.max(n1, n2);

        for (a = 1; a <= maxRows; a++) {
            if (a <= n1) {
                for (d = 1; d <= n1; d++) {
                    if (a == 1 || a == n1 || d == 1 || d == n1) {
                        System.out.print(n1 + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (d = 1; d <= n1; d++) System.out.print("  ");
            }

            System.out.print("  ");

            if (a <= n2) {
                for (d = 1; d <= n2; d++) {
                    if (a == 1 || a == n2 || d == 1 || d == n2) {
                        System.out.print(n2 + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (d = 1; d <= n2; d++) System.out.print("  ");
            }

            System.out.println();
        }

        sc.close();
    }
}