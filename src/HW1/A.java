package HW1;

import java.io.*;
public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] values;
        values = reader.readLine().split(" ");
        int tRoom = Integer.parseInt(values[0]);
        int tCond = Integer.parseInt(values[1]);
        values = reader.readLine().split(" ");
        String mode = values[0];
        int res = -1;
        switch (mode){
            case "freeze":
                if(tRoom <= tCond)
                    res = tRoom;
                else
                    res = tCond;
                break;
            case "heat":
                if(tRoom >= tCond)
                    res = tRoom;
                else
                    res = tCond;
                break;
            case "auto":
                res = tCond;
                break;
            case "fan":
                res = tRoom;
                break;
        }

        writer.write(String.valueOf(res));

        reader.close();
        writer.close();
    }
}
