import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsofaString345 {
    private String reverseVowels(String s) {
        char[] compare = {'a', 'e', 'i', 'o', 'u'};
        char[] str = s.toCharArray();
        int len = s.length();
        String reverse = "";
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i = len - 1; i >= 0; i--) {
            for (char aCompare : compare) {
                if (aCompare == Character.toLowerCase(str[i])) {
                    reverse += str[i];
                    pos.add(i);
                }
            }
        }

        for (int i = pos.size() - 1; i >= 0; i--) {
            str[pos.get(i)] = reverse.charAt(pos.size() - i - 1);
        }

        return String.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowelsofaString345().reverseVowels("hello"));
        System.out.println(new ReverseVowelsofaString345().reverseVowels("leetcode"));
        System.out.println(new ReverseVowelsofaString345().reverseVowels("race car"));
        System.out.println(new ReverseVowelsofaString345().reverseVowels("aA"));
    }
}
