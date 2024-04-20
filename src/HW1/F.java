package HW1;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        long[] l = new long[4];
        l[0] = Math.max(a, c) * (long) (b + d);
        l[1] = Math.max(a, d) * (long) (b + c);
        l[2] = Math.max(b, c) * (long) (a + d);
        l[3] = Math.max(b, d) * (long) (a + c);

        long minL = Math.min(Math.min(l[0], l[1]), Math.min(l[2], l[3]));

        if (minL == l[0]) {
            System.out.println(Math.max(a, c) + " " + (b + d));
        } else if (minL == l[1]) {
            System.out.println(Math.max(a, d) + " " + (b + c));
        } else if (minL == l[2]) {
            System.out.println(Math.max(b, c) + " " + (a + d));
        } else {
            System.out.println(Math.max(b, d) + " " + (a + c));
        }
    }
}
