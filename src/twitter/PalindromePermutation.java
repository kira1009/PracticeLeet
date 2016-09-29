package twitter;

/**
 * Created by cagekira on 3/20/16.
 */
public class PalindromePermutation {
    public static void main(String[] args){
        String s = "abbaac";
        char[] c = s.toCharArray();
        int[] arr = new int[26];
        for(char ch : c){
            arr[ch - 'a'] += 1;
        }
        int oddCount = 0;
        for(int i : arr){
            if(i % 2 == 1){
                oddCount += 1;
            }
        }
        if (oddCount > 1){
            System.out.print("False");
        }else{
            System.out.print("True");
        }
    }
}
