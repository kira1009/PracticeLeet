package twitter;

/**
 * Created by cagekira on 3/20/16.
 */
public class FindPrime {
    public static void main(String[] args){
        int n = 8;
        int count = 0;
        for(int i = 1; i < n; i++){
            int j = gcd(i,n);
            if (j == 1){
                count++;
            }
        }
        System.out.print(count);
    }
    public static int gcd(int a, int b){
        int divide = b;
        int divider = a;
        while(divider > 1){
            int tmp = divider;
            divider = divide % divider;
            divide = tmp;
        }
        return divider;
    }
}

