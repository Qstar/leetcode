public class NimGame292 {
    public static void main(String[] args){
        System.out.println(new NimGame292().canWinNim(5));
    }

    public boolean canWinNim(int n){
        return n % 4 != 0;
    }
}
