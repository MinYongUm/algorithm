package backjoon.lever3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);
        int result = 0;

        for (int i = 0; i <= num; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
