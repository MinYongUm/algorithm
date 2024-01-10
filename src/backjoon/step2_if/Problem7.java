package backjoon.step2_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strList = br.readLine().split(" ");

        int a = Integer.parseInt(strList[0]);
        int b = Integer.parseInt(strList[1]);
        int c = Integer.parseInt(strList[2]);
        int result = 0;

        if(a != b && b != c && a != c){
            int max;

            if(a > b){
                if(c > a){
                    max = c;
                } else {
                    max = a;
                }
            } else {
                if(c > b){
                    max = c;
                } else {
                    max = b;
                }
            }
            result = max * 100;
            System.out.println(result);

        } else {
            if(a == b && a == c){
                result = 10000 + a * 1000;
                System.out.println(result);
            } else {
                if(a == b || a == c){
                    result = 1000 + a * 100;
                    System.out.println(result);
                }else {
                    result = 1000 + b * 100;
                    System.out.println(result);
                }
            }
        }
    }
}
