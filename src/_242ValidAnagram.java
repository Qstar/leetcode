public class _242ValidAnagram {
    public static void main(String[] args){
        System.out.println(new _242ValidAnagram().isAnagram("rat", "cat"));
    }

    private boolean isAnagram(String s, String t){
        int ascs[] = new int[255];
        int asct[] = new int[255];
        boolean flag = true;
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        for (char aSarray : sarray) {
            ascs[aSarray]++;
        }
        for (char aTarray : tarray) {
            asct[aTarray]++;
        }
        for (int i = 0; i < 255; i++) {
            if (ascs[i] != asct[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
