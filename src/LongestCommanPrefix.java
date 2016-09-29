/**
 * Created by cagekira on 5/28/16.
 */
public class LongestCommanPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        int length = strs.length;
        int commonLength = 0;
        boolean flag = true;
        while(flag){
            for(int i = 0; i < length - 1; i++){
                if(commonLength >= strs[i].length()){
                    flag = false;
                    commonLength--;
                    break;
                }
                if(strs[i].charAt(commonLength) != strs[i + 1].charAt(commonLength)) flag = false;
            }
            commonLength++;
        }
        if(commonLength == 0) return "";
        return strs[0].substring(0, commonLength);
    }
    public static void main(String[] args){
        String[] s = new String[]{"aa","a"};
        System.out.print(longestCommonPrefix(s));
    }
}
