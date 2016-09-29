package twitter;

import java.util.HashMap;

/**
 * Created by cagekira on 3/20/16.
 */
public class SuperPower {

    public static void main(String[] args){
        int a = 126;
        int max = (int) Math.sqrt((double) a);
        for(int i = max; i >= 2; i--){
            int b = a;
            while(b % i == 0){
                b = b / i;
            }
            if (b == 1){
                System.out.print("True");
                return;
            }
        }
        System.out.print("False");
    }
}
