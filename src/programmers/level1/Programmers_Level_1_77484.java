package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gwang Jin Kim on 15/05/21.
 *
 * Title : 로또의 최고 순위와 최저 순위
 *
 * Approach
 * 1. lottos 와 win_nums 배열의 원소들을 가진 두 리스트를 생성한다.
 * 2. 두 리스트의 중복 원소의 개수를 찾는다.
 * 3. 최고 순위에는 중복 원소의 개수 + 지워진 로또 번호의 개수
 * 4. 최저 순위는 중복 원소의 개수
 */
public class Programmers_Level_1_77484 {
    private static class Solution {
        public int[] solution(int [] lottos, int [] win_nums) {
            int[] answer = new int[2];
            int low = 0;
            int top = 0;
            int countZero = 0;

            List<Integer> lottoList = new ArrayList<>();
            for (int num : lottos) {
                if (num == 0) {
                    countZero++;
                }
                lottoList.add(num);
            }

            List<Integer> winNumList = new ArrayList<>();
            for (int num : win_nums) {
                winNumList.add(num);
            }

            lottoList.retainAll(winNumList);

            top = lottoList.size() + countZero;
            low = lottoList.size();

            switch (top) {
                case 6: top = 1;
                    break;
                case 5: top = 2;
                    break;
                case 4: top = 3;
                    break;
                case 3: top = 4;
                    break;
                case 2: top = 5;
                    break;
                default: top = 6;
            }

            switch (low) {
                case 6: low = 1;
                    break;
                case 5: low = 2;
                    break;
                case 4: low = 3;
                    break;
                case 3: low = 4;
                    break;
                case 2: low = 5;
                    break;
                default: low = 6;
            }

            answer[0] = top;
            answer[1] = low;

            return answer;
        }

    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] result = new Solution().solution(lottos, win_nums);

        for(int res: result) {
            System.out.print(res + " ");
        }
    }
}
