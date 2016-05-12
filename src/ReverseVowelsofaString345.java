import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsofaString345 {
    private String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        char[] str = s.toCharArray();
        int len = str.length;
        String reverse = "";
        int[] pos = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            if (vowels.contains(str[i])) {
                reverse += str[i];
                pos[len - i - 1] = len - i;
            }
        }
        int lenPos = pos.length;
        int count = 0;
        for (int po : pos) {
            if (po != 0) {
                str[po] = reverse.charAt(count);
                count++;
            }
        }
        return Arrays.toString(str);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowelsofaString345().reverseVowels("hello"));
        System.out.println(new ReverseVowelsofaString345().reverseVowels("leetcode"));
    }
}
