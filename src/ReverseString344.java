public class ReverseString344 {
    public static void main(String[] args){
        System.out.println(new ReverseString344().reverseString("hello"));
    }

    private String reverseString(String s){
        return new StringBuffer(s).reverse().toString();
    }
}
