import java.util.*;

public class _387FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s = "leetcode";
        String s1 = "loveleetcode";

        System.out.println(new _387FirstUniqueCharacterinaString().firstUniqChar(s));
        System.out.println(new _387FirstUniqueCharacterinaString().firstUniqChar(s1));
    }

    /**
     * Java Program to find first duplicate, non-repeated character in a String.
     * It demonstrate three simple example to do this programming problem.
     */
    public static char getFirstNonRepeatedChar(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>(
                str.length());
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }

    /**
     * Using HashMap to find first non-repeated character from String in Java.
     * Algorithm :
     * <p>
     * Step 1 : Scan String and store count of each character in HashMap
     * <p>
     * Step 2 : traverse String and get count for each character from Map. Since
     * we are going through String from first to last character, * when count
     * for any character is 1, we break, it's the first * non repeated
     * character. Here order is achieved by going * through String again.
     */
    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }

    /**
     * Using HashMap to find first non-repeated character from String in Java.
     * Algorithm :
     * <p>
     * Step 1 : Scan String and store count of each character in HashMap
     * <p>
     * Step 2 : traverse String and get count for each character from Map. Since
     * we are going through String from first to last character, when count for
     * any character is 1, we break, it's the first non repeated character. Here
     * order is achieved by going through String again.
     *
     * @return
     */
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> scoreboard = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (scoreboard.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

}
