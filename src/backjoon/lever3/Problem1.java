package backjoon.lever3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int gugudan = Integer.parseInt(str);

        for (int i = 1; i < 10; i++) {
            System.out.println(gugudan + " * " + i + " = " + (gugudan*i));
        }
    }
}
