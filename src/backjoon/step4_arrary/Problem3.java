package backjoon.step4_arrary;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int index = 0;

        int[] arr = new int[n];

        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[n - 1]);
    }

}