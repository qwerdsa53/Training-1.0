package HW1;

import java.io.*;
import java.util.*;
public class C {
    public static String[] FormattingTheNumber(String[] number){
        if (Arrays.asList(number).contains("-") || Arrays.asList(number).contains("(") || Arrays.asList(number).contains("+")) {
            int j = 0;
            for (int i = 0; i < number.length; i++) {
                if(!number[i].equals("-") && !number[i].equals("(") && !number[i].equals(")")&& !number[i].equals("+")){
                    number[j] = number[i];
                    j++;
                }
            }
            String[] res = new String[j];
            System.arraycopy(number, 0, res, 0, j);
            if(res.length==11)
                res[0] = "8";
            return res;
        }

        return number;
    }
    public static String[] ResFormattingTheNumber(String[] number){
        number = FormattingTheNumber(number);
        if(number.length == 7){
            String[] res = new String[number.length+4];
            res[0] = "8";
            res[1] = "4";
            res[2] = "9";
            res[3] = "5";
            System.arraycopy(number, 0, res, 4, 7);
            return res;
        }
        return number;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] value = reader.readLine().split("");
        value = ResFormattingTheNumber(value);
        String[] values;
        for (int i = 0; i < 3; i++) {
            values = reader.readLine().split("");
            String[] temp = ResFormattingTheNumber(values);
            writer.write((Arrays.equals(temp,value)) ? "YES\n" : "NO\n");


        }
        reader.close();
        writer.close();
    }
}
