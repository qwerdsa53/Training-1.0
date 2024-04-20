import java.io.*;
import java.util.regex.Pattern;


public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));

        String[] values = reader.readLine().split(" ");
        long a = Long.parseLong(values[0]);
        long b = Long.parseLong(values[1]);

        writer.write(String.valueOf(a+b));

        reader.close();
        writer.close();
    }
}