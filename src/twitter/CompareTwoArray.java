package twitter;

/**
 * Created by cagekira on 3/20/16.
 */
public class CompareTwoArray {
    public static void main(String[] args){
        int a1 = 5;
        int b1 = 7;
        int limit = 100;
        int p = 2;
        int w = 3;
        int count = 0;
        while(b1 < limit){
            if((b1 - a1) % w == 0){
                count++;
                System.out.println(b1);
            }
            b1 = b1 * p;
        }
        System.out.print(count);
    }
}
