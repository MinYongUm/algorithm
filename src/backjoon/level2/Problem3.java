package backjoon.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String yeatStr = br.readLine();

        int resultNum = Integer.parseInt(yeatStr);

        if(resultNum % 4 == 0 && resultNum % 100 != 0 || resultNum % 400 == 0){
            System.out.println("1");
        }  else {
            System.out.println("0");
        }

    }
}
