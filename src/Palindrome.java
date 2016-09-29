/**
 * Created by cagekira on 9/8/16.
 */
public class Palindrome {

    public static boolean isPalindrome(String s) {
        if(s == null || s.length() < 2) return true;
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            char frontChar = s.charAt(i);
            int front = frontChar - 'a';
            if(front < 0 || front > 25){
                front = frontChar - 'A';
            }
            if(front < 0 || front > 25){
                front = frontChar - '0';
            }
            if(front < 0 || front > 9){
                i++;
                continue;
            }else{
                front += 26;
            }
            char rearChar = s.charAt(j);
            int rear = rearChar - 'a';
            if(rear < 0 || rear > 25){
                rear = rearChar - 'A';
            }
            if(rear < 0 || rear > 25){
                rear = rearChar - '0';
            }
            if(rear < 0 || rear > 9){
                j--;
                continue;
            }else{
                rear += 26;
            }
            if(front != rear) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print(isPalindrome("0P"));
    }
}
