public class AddBinary67 {
    public static void main(String[] args){
        System.out.println(new AddBinary67().addBinary("11", "1"));
    }

    public String addBinary(String a, String b){
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        StringBuffer sb = null;
        int lena = aa.length;
        int lenb = bb.length;
        int sum = Integer.parseInt("" + aa[lena - 1]) + Integer.parseInt("" + bb[lenb - 1]);
        if (sum == 2) {
            sb.append("0");
        }

        return sb.reverse().toString();
    }
}
