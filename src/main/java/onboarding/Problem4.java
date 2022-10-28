package onboarding;

/**
 * [풀이 방법]
 * 대문자와 소문자의 경우에 따라 아스키코드 값을 조절하여 변경해준다.
 * - 대문자 일 경우 -> 'Z'에서 현재 단어를 빼준 뒤, 'A'+1 즉 65만큼 더해준다
 * - 소문자 일 경우 -> 'z'에서 현재 단어를 빼준 뒤, 'a'+1 즉 97만큼 더해준다
 */
public class Problem4 {
    public static String solution(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (word.charAt(i) == 32) { // 만약 빈칸이라면 그냥 sb에 추가
                sb.append(c);
            }

            if (c >= 64 && c <= 90) { // 대문자에 해당하는 경우
                sb.append((char) ('Z' - c + 65));
            } else if (c >= 97 && c <= 122) { // 소문자에 해당하는 경우
                sb.append((char) ('z' - c + 97));
            }
        }

        return sb.toString();
    }
}
