package backjoon.step2_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strA = br.readLine();
        String strB = br.readLine();

        int resultA = Integer.parseInt(strA);
        int resultB = Integer.parseInt(strB);

        if (resultA > 0 && resultB > 0) {
            System.out.println("1");
        } else if (resultA < 0 && resultB > 0) {
            System.out.println("2");
        } else if (resultA < 0 && resultB < 0) {
            System.out.println("3");
        } else if (resultA > 0 && resultB < 0) {
            System.out.println("4");
        }

    }
}
