import java.io.*;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = reader.readLine();
        writer.write(isValidName(name) ? "YES" : "NO");
        reader.close();
        writer.close();
    }
    public static boolean isValidName(String name) {
        if (name.length() < 8) {
            return false;}
        if (!Pattern.compile("\\d").matcher(name).find()) {
            return false;
        }
        if (!Pattern.compile("[A-Z]").matcher(name).find()) {
            return false;
        }
        if (!Pattern.compile("[a-z]").matcher(name).find()) {
            return false;
        }
        return true;
    }
}
