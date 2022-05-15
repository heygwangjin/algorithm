package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Gwang Jin Kim on 2021/12/20
 * Problem : 1로 만들기
 * URL : https://www.acmicpc.net/problem/1463
 */

public class BOJ1463 {
    static int[] dp = new int[1000001];
    static int n;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        System.out.println(calMinimum(n));
    }

    static int calMinimum(int n) {
        for (int i = 2; i < n + 1; i++) {
            // 현재 수에서 1을 빼는 연산
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Integer.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Integer.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n];
    }
}