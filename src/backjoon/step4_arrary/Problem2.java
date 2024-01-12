package backjoon.step4_arrary;

import java.io.*;

public class Problem2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strTotal = br.readLine().split(" ");
        String[] strArray = br.readLine().split(" ");

        int numTotal = Integer.parseInt(strTotal[0]);
        int numSearch = Integer.parseInt(strTotal[1]);
        int[] numArrary = new int[numTotal + 1];

        int result = 0;

        for (int i = 0; i < strArray.length; i++) {
            numArrary[i] = Integer.parseInt(strArray[i]);
            if(numArrary[i] < numSearch){
                result = numArrary[i];
                System.out.print(result + " ");
            }
        }
    }

}
