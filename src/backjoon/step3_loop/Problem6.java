package backjoon.step3_loop;

import java.io.*;

public class Problem6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String strLoop = br.readLine();
        long loop = Long.parseLong(strLoop);

        int result = 0;
        String strResult = null;

        for (int i = 0; i < loop; i++) {
            String[] strArray = br.readLine().split(" ");

            int numA = Integer.parseInt(strArray[0]);
            int numB = Integer.parseInt(strArray[1]);

            result = numA + numB;
            strResult = String.valueOf(result);

            bw.write(strResult);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
