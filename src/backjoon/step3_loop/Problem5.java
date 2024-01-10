package backjoon.step3_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        long num = Integer.parseInt(str);
        long loop = num / 4;

        String strLong = "long ";
        String result = strLong;

        if(num % 4 == 0){
            for (int i = 1; i < loop; i++) {
                result += strLong;
            }
        }
        System.out.println(result + "int");
    }
}
