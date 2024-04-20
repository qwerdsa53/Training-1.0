package HW1;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        if ((A <= D && B <= E) || (A <= E && B <= D)) {
            System.out.println("YES");
        } else if ((C <= D && B <= E) || (C <= E && B <= D)) {
            System.out.println("YES");
        } else if ((A <= D && C <= E) || (A <= E && C <= D)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

