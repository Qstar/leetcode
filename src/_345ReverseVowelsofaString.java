import java.util.ArrayList;

public class _345ReverseVowelsofaString {
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
        System.out.println(new _345ReverseVowelsofaString().reverseVowels("hello"));
        System.out.println(new _345ReverseVowelsofaString().reverseVowels("leetcode"));
        System.out.println(new _345ReverseVowelsofaString().reverseVowels("race car"));
        System.out.println(new _345ReverseVowelsofaString().reverseVowels("aA"));
    }
}
