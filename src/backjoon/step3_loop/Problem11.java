package backjoon.step3_loop;

import java.io.*;
import java.util.StringTokenizer;

public class Problem11 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        int numA = 0;
        int numB = 0;

        while ((str = br.readLine()) != null){

            st = new StringTokenizer(str, " ");
            numA = Integer.parseInt(st.nextToken());
            numB = Integer.parseInt(st.nextToken());

            sb.append(numA + numB).append("\n");
        }
        System.out.println(sb);
    }

}
