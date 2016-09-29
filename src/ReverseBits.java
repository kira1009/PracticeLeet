/**
 * Created by cagekira on 5/23/16.
 */
public class ReverseBits {

    public static int reverseBits(int n) {
        int i = 31;
        String s= Integer.toBinaryString(n);
        long reversed = 0;
        for(int j = s.length() - 1; j >= 0; j--){
            if(s.charAt(j) == '1') reversed += 1 << i;
            i--;
        }
        return (int)reversed;
    }
    public static void main(String[] args){
        System.out.print(reverseBits(2));
    }
}
