package HW1;

import java.io.*;


public class H {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        int min1 = a*(n-1) + n;
        int max1 = min1 + 2*a;
        int min2 = b*(m-1) + m;
        int max2 = min2 + 2*b;

        int resMin = Math.max(min1,min2);
        int resMax = Math.min(max1,max2);
        if(resMax<resMin)
            writer.write(String.valueOf(-1));
        else
            writer.write(resMin + " " + resMax);

        reader.close();
        writer.close();
    }
}

