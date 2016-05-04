public class AddDigits258 {
    public static void main(String[] args){
        System.out.println(new AddDigits258().addDigits(38));
        System.out.println(new AddDigits258().addDigits2(38));
        System.out.println(new AddDigits258().addDigits3(38));
    }

    private int addDigits(int num){
        String numStr = String.valueOf(num);
        int result = 0;
        for (int i = 0; i < numStr.length(); i++) {
            result += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        if (String.valueOf(result).length() > 1) {
            return addDigits(result);
        } else {
            return result;
        }
    }


    private int addDigits2(int num){
        while (num >= 10) {
            num = (num / 10) + num % 10;
        }
        return num;
    }

    private int addDigits3(int num){
        return 1 + (num - 1) % 9;
    }
}
