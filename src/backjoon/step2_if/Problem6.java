package backjoon.step2_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strList = br.readLine().split(" ");
        String str = br.readLine();

        int hour = Integer.parseInt(strList[0]);
        int min = Integer.parseInt(strList[1]);
        int ovenTime = Integer.parseInt(str);

        int totalMin = 60 * hour + min;
        totalMin += ovenTime;

        int resultHour = (totalMin / 60) % 24;
        int resultMin = totalMin % 60;

        System.out.println(resultHour + " " + resultMin);

    }
}
