public class AddBinary67 {
    public static void main(String[] args){
        System.out.println(new AddBinary67().addBinary("11", "1"));
    }

    public String addBinary(String a, String b){
        String result = "";
        int count = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || count == 1) {
            count += i >= 0 ? a.charAt(i--) - '0' : 0;
            count += j >= 0 ? b.charAt(j--) - '0' : 0;
            result += (char) (count % 2 + '0');
            count /= 2;
        }
        return new StringBuffer(result).reverse().toString();
    }
}
