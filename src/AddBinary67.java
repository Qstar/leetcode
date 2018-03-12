public class AddBinary67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(new AddBinary67().addBinary67(a, b));
    }

    public String addBinary67(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder str = new StringBuilder();
        while (j >= 0 || i >= 0) {
            if (i >= 0 && a.charAt(i--) == '1') carry++;
            if (j >= 0 && b.charAt(j--) == '1') carry++;
            str.insert(0, (carry % 2));
            carry /= 2;
        }
        if (carry == 1) str.insert(0, "1");
        return str.toString();
    }
}
