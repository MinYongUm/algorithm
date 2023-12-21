package backjoon.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs1 = br.readLine().split(" ");
        String[] strs2 = br.readLine().split("");

        int resultNum1 = Integer.parseInt(strs2[0]);
        int resultNum2 = Integer.parseInt(strs2[1]);
        int resultNum3 = Integer.parseInt(strs2[2]);

        for (String str1 : strs1) {
            int resultStrNum = Integer.parseInt(str1);

            int add1 = resultStrNum * resultNum3;
            int add2 = resultStrNum * resultNum2;
            int add3 = resultStrNum * resultNum1;
            int totalAdd = add1 + (add2 * 10) + (add3 * 100);

            System.out.println(add1);
            System.out.println(add2);
            System.out.println(add3);
            System.out.println(totalAdd);
        }

    }
}
