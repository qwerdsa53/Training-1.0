package HW1;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpNumbers = scanner.nextLine();
        String[] splitNumbers = inpNumbers.split(" ");
        int[] numbers = new int[splitNumbers.length];
        for (int i = 0; i < splitNumbers.length; i++) {
            numbers[i] = Integer.parseInt(splitNumbers[i]);
        }

        int n = numbers[0];
        int k = numbers[1];
        int m = numbers[2];

        if (n == 0 || k == 0 || m == 0) {
            System.out.println(0);
        } else if (m > k || k > n || m > n) {
            System.out.println(0);
        } else {
            int cntPt = 0;

            while (n >= k) {
                int cntWp = n / k;
                cntPt += cntWp * (k / m);
                n -= cntWp * (k / m) * m;
            }

            System.out.println(cntPt);
        }
    }
}

