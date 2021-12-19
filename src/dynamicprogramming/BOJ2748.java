package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Gwang Jin Kim on 2021/12/20
 *
 * Problem : 피보나치 수 2
 * URL : https://www.acmicpc.net/problem/2748
 */

public class BOJ2748 {
    static long[] dp = new long[90];
    static int n;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    static long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        if (dp[n] != 0) // 이미 테이블에 기록이 있으면 반환
            return dp[n];
        else
            dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return dp[n];
    }
}
