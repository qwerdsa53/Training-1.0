package HW1;

import java.io.*;
public class B {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int side1 = Integer.parseInt(reader.readLine());
        int side2 = Integer.parseInt(reader.readLine());
        int side3 = Integer.parseInt(reader.readLine());

        if(side1 + side2 > side3 && side1 + side3 > side2 && side2+side3> side1)
            writer.write("YES");
        else
            writer.write("NO");

        reader.close();
        writer.close();
    }
}

