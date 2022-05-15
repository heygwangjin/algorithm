package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gwang Jin Kim on 17/10/21.
 *
 * Title : 같은 숫자는 싫어
 *
 * Approach
 * 1. 배열의 이전 원소와 다음 원소가 같지 않으면 원소를 리스트에 추가한다.
 * 2. 이전 원소를 업데이트 한다.
 */
public class Programmers_Level_1_12906 {
    private static class Solution {
        public int[] solution(int []arr) {
            List<Integer> list = new ArrayList<>();

            int prev = -1;
            for (int num : arr) {
                if (prev != num) list.add(num);
                prev = num;
            }

            // Integer to int
            return list.stream().mapToInt(Integer::intValue).toArray();
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
