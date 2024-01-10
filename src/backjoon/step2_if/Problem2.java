package backjoon.step2_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sts = br.readLine();

        int resultNum = Integer.parseInt(sts);

        if(resultNum >= 90 && resultNum <= 100){
            System.out.println("A");
        } else if (resultNum >= 80 && resultNum <= 89) {
            System.out.println("B");
        } else if (resultNum >= 70 && resultNum <= 79) {
            System.out.println("C");
        } else if (resultNum >= 60 && resultNum <= 69) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
