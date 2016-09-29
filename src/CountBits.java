import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by cagekira on 5/10/16.
 */
public class CountBits {
    public static int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        res[1] = 1;
        int exp = 1;
        for(int i = 2; i <= num; i++){
            while(i >= Math.pow(2,exp)){
                exp++;
            }
            int pre = i % (int) Math.pow(2,exp-1);
            res[i] = res[pre] + 1;
        }
        return res;
    }

    public static void main(String[] args){
        int i = 2;
        int[] res = countBits(i);
        for(int j : res){
            System.out.println(j);
        }
    }

}
