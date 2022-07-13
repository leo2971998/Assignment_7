import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();
        while (true) {
            if (n % 2 == 1) {
                break;
            } else {
                System.out.println("This is not an odd number.");
                System.out.print("Enter an odd number: ");
                n = sc.nextInt();
            }
        }
        for (int i = 0; i < n/2 + 1; i++) {
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*\t");
                }
            }
            else {
                for (int k = 0; k < n; k++) {
                    if (k == 0 || k == i || k == n - 1 - i || k == n - 1) {
                        System.out.print("*\t");
                    }
                    else System.out.print(" \t");
                }
            }
            System.out.println();
        }
        for (int i = n/2 - 1; i >= 0; i--) {
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*\t");
                }
            }
            else {
                for (int k = n - 1; k >= 0; k--) {
                    if (k == 0 || k == i || k == n - 1 - i || k == n - 1) {
                        System.out.print("*\t");
                    }
                    else System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
