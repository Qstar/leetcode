public class _389FindtheDifference {
    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        System.out.println(new _389FindtheDifference().findTheDifference(s, t));
    }

    public char findTheDifference(String s, String t){
        char ret = 0;
        String sum = s + t;
        for (int i = 0; i < sum.length(); i++) {
            ret ^= sum.charAt(i);
        }
        return ret;
    }
}
