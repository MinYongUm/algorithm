package backjoon.step4_arrary;

import java.io.*;

public class Problem1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strTotal = br.readLine();
        String[] strArray = br.readLine().split(" ");
        String strSearch = br.readLine();

        int numTotal = Integer.parseInt(strTotal);
        int[] numArrary = new int[numTotal + 1];
        int numSearch = Integer.parseInt(strSearch);
        int count = 0;

        for (int i = 0; i < strArray.length; i++) {
            numArrary[i] = Integer.parseInt(strArray[i]);
            if(numArrary[i] == numSearch){
                count++;
            }
        }
        System.out.println(count);
    }

}
