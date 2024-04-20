package HW2;

import java.io.*;


public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] values = reader.readLine().split(" ");
        boolean flag = true;

        for (int i = 0; i < values.length-1; i++) {
            if (Integer.parseInt(values[i + 1]) <= Integer.parseInt(values[i])){
                flag = false;
            }
        }
        writer.write(flag ? "YES" : "NO");
        reader.close();
        writer.close();
    }
}

