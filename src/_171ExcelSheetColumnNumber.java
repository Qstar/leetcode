public class _171ExcelSheetColumnNumber {
    public static void main(String[] args){
        System.out.println(new _171ExcelSheetColumnNumber().titleToNumber("AD"));
    }

    public int titleToNumber(String s){
        char[] alphbet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'};
        int ret = 0;

        char[] array = new StringBuffer(s).reverse().toString().toCharArray();
        int len = array.length;
        int alphbetLen = alphbet.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < alphbetLen; j++)
                if (alphbet[j] == array[i]) {
                    ret += (int) Math.pow(26, i) * (j + 1);
                }
        }
        return ret;
    }
}
