package HW1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.#####", symbols);
        double x, y;
        double det = a * d - b * c;
        double detx, dety;
        // a*x + b*y = e
        // c*x + d*y = f
        if (det == 0) {
            if ((a == 0 && c == 0 && e / b != f / d) || (b == 0 && d == 0 && e / a != f / c)) {
                System.out.println("0");
                return;
            }
            if (a == 0 && c == 0 && e / b == f / d) {
                if(e / b == (int)(e / b))
                    System.out.println("4 " + (int)(e / b));
                else
                    System.out.println("4 " + df.format( e / b));
                return;
            }
            if (b == 0 && d == 0 && e / a == f / c) {
                if(e / a == (int)(e / a))
                    System.out.println("3 " + (int)(e / a));
                else
                    System.out.println("3 " + df.format( e / a));
                return;
            }
            if (c * b / a - d == 0) {
                if(-a / b == (int)(-a / b) && e / b == (int)(e / b))
                    System.out.println("1 " + (int)(-a / b) + "  " + (int)(e / b));
                else if(-a / b == (int)(-a / b) && e / b != (int)(e / b))
                    System.out.println("1 " + (int)(-a / b) + "  " +df.format( e / b));
                else if (-a / b != (int) (-a / b) && e / b == (int) (e / b))
                    System.out.println("1 " + df.format(-a / b) + "  " + (int)(e / b));
                else
                    System.out.println("1 " + df.format(-a / b) + "  " + df.format(e / b));
                return;
            }
//            y = (f - c * e * 1. / a) / (c * b * 1. / a - d);
//            x = (e - b * y) / a;
//            if(x == (int)(x) && y == (int)(y))
//                System.out.println("1 " + (int)(-a / b) + "  " + (int)(e / b));
//            else if(-a / b == (int)(-a / b) && e / b != (int)(e / b))
//                System.out.println("1 " + (int)(-a / b) + "  " +(e / b));
//            else if (-a / b != (int) (-a / b) && e / b == (int) (e / b))
//                System.out.println("1 " + (-a / b) + "  " + (int)(e / b));
//            else
//                System.out.println("1 " + (-a / b) + "  " + (e / b));
//            System.out.println("x = " + x + "   y = " + y);
        } else {
            detx = e * d - b * f;
            dety = a * f - e * c;
            x = detx / det;
            y = dety / det;
            if(x == (int)x)
                System.out.println("2 " + (int)x + " " + (int)y);
            else
                System.out.println("2 " + df.format(x) + " " + df.format(y));
        }
    }
}
