package onboarding;

import java.util.*;

/**
 * [기능 구현]
 * 1. 각자의 친구 목록을 전역변수인 map_friends 에 <key, list> 형식으로 저장하는 메소드
 * 2. 주어지는 user 를 기준으로 하나씩 비교하며 함께 아는친구 판별 후 map_points <key, integer> 형식으로 점수 추가하는 메소드
 * 3. 주어지는 user 의 친구목록에 해당하지 않는 visitor 의 점수 추가하는 메소드
 * 4. 점수를 저장하는 map 을 value 기준으로 내림차순 정렬하는 메소드 -> stream 사용 treemap 을 사용했기 때문에 key 는 자동 오름차순 정렬
 **/
public class Problem7 {
    private static Map<String, ArrayList> map_friends = new HashMap<>();

    // 각자의 친구 목록을 자료구조 hashmap 을 사용해 저장해주는 메소드
    private static void makeFriendsMap(List<List<String>> friends) {
        for (List<String> list : friends) {
            ArrayList A_List = map_friends.getOrDefault(list.get(0), new ArrayList());
            ArrayList B_List = map_friends.getOrDefault(list.get(1), new ArrayList());

            A_List.add(list.get(1));
            B_List.add(list.get(0));

            map_friends.put(list.get(0), A_List);
            map_friends.put(list.get(1), B_List);
        }
    }

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<>();
        return answer;
    }
}
