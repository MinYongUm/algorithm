package backjoon.step3_loop;

import java.io.*;

public class Problem10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numA = 0;
        int numB = 0;
        int result = 0;
        String strResult = null;

        while (true){
            String[] strArray = br.readLine().split(" ");
            numA = Integer.parseInt(strArray[0]);
            numB = Integer.parseInt(strArray[1]);

            if(numA != 0 && numB != 0){
                result = numA + numB;
                strResult = String.valueOf(result);

                bw.write(strResult);
                bw.newLine();

            } else {
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
