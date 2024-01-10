package backjoon.step3_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String totalStr = br.readLine();
        String totalEaStr = br.readLine();
        long totalPrice = Integer.parseInt(totalStr);
        int totalEa = Integer.parseInt(totalEaStr);
        int result = 0;

        for (int i = 0; i < totalEa; i++) {
            String[] strArray = br.readLine().split(" ");

            long numA = Integer.parseInt(strArray[0]);
            long numB = Integer.parseInt(strArray[1]);

            result += (numA * numB);

        }

        if(totalPrice == result){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
