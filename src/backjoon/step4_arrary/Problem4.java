package backjoon.step4_arrary;

import java.io.*;
import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int numMax = 0;
        int indexSearch = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int auth : arr){
            count++;

            if(auth > numMax){

                numMax = auth;
                indexSearch = count;
            }
        }

        System.out.println(numMax);
        System.out.println(indexSearch);

    }

}