public class _344ReverseString {
    public static void main(String[] args){
        System.out.println(new _344ReverseString().reverseString("hello"));
    }

    private String reverseString(String s){
        return new StringBuffer(s).reverse().toString();
    }
}
