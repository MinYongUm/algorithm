package backjoon.lever3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strLoop = br.readLine();
        int loop = Integer.parseInt(strLoop);

        for (int i = 0; i < loop; i++) {
            String[] strArrary = br.readLine().split(" ");
            int numA = Integer.parseInt(strArrary[0]);
            int numB = Integer.parseInt(strArrary[1]);

            System.out.println(numA + numB);
        }

    }
}
