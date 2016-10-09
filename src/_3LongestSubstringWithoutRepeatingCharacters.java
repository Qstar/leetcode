/**
 * 思路：利用一个exist数组保存字符是否出现（假设char set是ascii），
 * 从前向后遍历数组，如果遇到已存在的字符，应该回退到这个字符上次出现
 * 的下一个位置从新开始统计（如下图），同时注意exist数组的同步更新。
 */
public class _3LongestSubstringWithoutRepeatingCharacters {
    private int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        boolean[] exist = new boolean[128];
        int start = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (exist[c]) {
                result = Math.max(result, i - start);
                for (int j = start; j < i; j++) {
                    if (s.charAt(j) == c) {
                        start = j + 1;
                        break;
                    }
                    exist[s.charAt(j)] = false;
                }
            } else {
                exist[c] = true;
            }
        }
        result = Math.max(result, s.length() - start);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbbb"));
        System.out.println(new _3LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
    }
}
