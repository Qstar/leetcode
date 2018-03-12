public class _292NimGame {
    public static void main(String[] args){
        System.out.println(new _292NimGame().canWinNim(5));
    }

    public boolean canWinNim(int n){
        return n % 4 != 0;
    }
}
