import java.io.*;


public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int cntOfPoints = Integer.parseInt(reader.readLine());
        int[] x = new int[cntOfPoints];
        int[] y = new int[cntOfPoints];
        String[] values;
        for (int i = 0; i < cntOfPoints; i++) {
            values = reader.readLine().split(" ");
            x[i] = Integer.parseInt(values[0]);
            y[i] = Integer.parseInt(values[1]);
        }
        int m = Integer.parseInt(reader.readLine());
        int[] pathStart = new int[m];
        int[] pathEnd = new int[m];
        for (int i = 0; i < m; i++) {
            values = reader.readLine().split(" ");
            pathStart[i] = Integer.parseInt(values[0]);
            pathEnd[i] = Integer.parseInt(values[1]);
        }
        int[] prSum = new int[cntOfPoints];
        int[] revPrSum = new int[cntOfPoints];
        for (int i = 0; i < cntOfPoints - 1; i++) {
            if(y[i] < y[i+1])
                prSum[i+1] = prSum[i] + y[i+1] - y[i];
            else
                prSum[i+1] = prSum[i];
        }
        for (int i = cntOfPoints - 1; i > 0 ; i--) {
            if(y[i] < y[i-1])
                revPrSum[i-1] = revPrSum[i] + y[i-1] - y[i];
            else
                revPrSum[i-1] = revPrSum[i];
        }
        for (int i = 0; i < m; i++) {
            int hight = 0;
            if(pathStart[i] < pathEnd[i]){
                hight = prSum[pathEnd[i]-1] - prSum[pathStart[i]-1];
                writer.write(String.valueOf(hight)+"\n");
            } else if (pathStart[i] > pathEnd[i]) {
                hight = revPrSum[pathEnd[i]-1] - revPrSum[pathStart[i]-1];
                writer.write(String.valueOf(hight)+"\n");
            }else{
                hight = 0;
                writer.write(String.valueOf(hight)+"\n");
            }
        }
        reader.close();
        writer.close();
    }
}
