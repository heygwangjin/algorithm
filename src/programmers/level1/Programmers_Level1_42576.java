package programmers.level1;

import java.util.HashMap;

/**
 * Created by Gwang Jin Kim on 15/05/22.
 *
 * Title : 완주하지 못한 선수
 *
 * Approach
 * 1. 참가자 배열의 값을 HashMap의 key로 지정하고, value 에는 key가 나온 횟수를 등록한다.
 * 2. 완주자 배열의 값을 key로 가지고 있으면, value 의 값을 1 감소시킨다.
 * 3. HashMap 안에 있는 키의 value가 0이 아니라는 의미는 참가는 했지만 완주는 안했다는 의미가 된다.
 *
 */

public class Programmers_Level1_42576 {
    private static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            HashMap<String, Integer> hashMap = new HashMap<>();

            for (String s : participant) {
                if (hashMap.containsKey(s)) {
                    hashMap.put(s, hashMap.get(s) + 1);
                } else {
                    hashMap.put(s, 1);
                }
            }

            for (String s : completion) {
                if (hashMap.containsKey(s)) {
                    hashMap.put(s, hashMap.get(s) - 1);
                }
            }

            for (String s : participant) {
                if (hashMap.get(s) == 1)
                    answer = s;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String result = new Programmers_Level1_42576.Solution().solution(participant, completion);

        System.out.print(result);
    }
}
