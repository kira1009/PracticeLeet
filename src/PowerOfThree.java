import sun.jvm.hotspot.memory.HeapBlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cagekira on 2/10/16.
 * Math method to solve power of n
 */
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        Double d = Math.log10(n)/Math.log10(3);
//        System.out.println(d);
        if(d%1 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        isPowerOfThree(243);
        String s = "12312";
        String[] a = s.split("");
        for(String x : a) System.out.println(x);
    }
}
