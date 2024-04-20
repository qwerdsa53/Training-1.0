package HW1;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K1 = scanner.nextInt();
        int M = scanner.nextInt();
        int K2 = scanner.nextInt();
        int P2 = scanner.nextInt();
        int N2 = scanner.nextInt();

        int floors = -1;
        int entrances = -1;
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= K1; j++) {
                int tempK2 = (P2 - 1) * i * M + (N2 - 1) * j + 1;
                if (tempK2 == K2) {
                    if (floors == -1 && entrances == -1) {
                        floors = i;
                        entrances = j;
                    } else if (floors != i && entrances != j) {
                        floors = 0;
                        entrances = 0;
                    }
                }
            }
        }

        if (floors == -1 && entrances == -1) {
            System.out.println("-1 -1");
        } else {
            System.out.println(entrances + " " + floors);
        }
    }
}
