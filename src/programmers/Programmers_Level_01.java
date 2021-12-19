package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gwang Jin Kim on 10/17/21.
 *
 * Name : 같은 숫자는 싫어
 *
 * Approach
 * 1. 배열의 이전 원소와 다음 원소가 같지 않으면 원소를 리스트에 추가한다.
 * 2. 이전 원소를 업데이트 한다.
 */
public class Programmers_Level_01 {
    private static class Solution {
        public int[] solution(int []arr) {
            int[] answer;

            List<Integer> list = new ArrayList<>();

            int prev = -1;
            for(int i = 0; i < arr.length; i++) {
                if (prev != arr[i]) list.add(arr[i]);
                prev = arr[i];
            }

            // Integer to int
            answer = list.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {1, 3, 3, 2, 4, 4, 0, 1, 1, 1};

        int[] result = new Solution().solution(arr1);

        for(int res: result) {
            System.out.print(res + " ");
        }

        System.out.println("");

        int[] result2 = new Solution().solution(arr2);

        for(int res: result2) {
            System.out.print(res + " ");
        }
    }
}
