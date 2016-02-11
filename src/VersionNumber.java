/**
 * Created by cagekira on 1/29/16.
 * Leetcode VersionNumber
 */
public class VersionNumber {
    public static void main(String[] args){
        String s1 = "1.0";
        String s2 = "1";
        int i = compareVersion(s1, s2);
        System.out.println(i);
    }
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        if (v1.length > v2.length){
            return subCompare(v1, v2);
        }else {
            return -1 * subCompare(v2, v1);
        }
    }

    public static int subCompare(String[] stringArray1, String[] stringArray2){
        int length = stringArray2.length;
        int result = 0;
        for (int i = 0; i < length; i++){
            if (Integer.parseInt(stringArray1[i]) > Integer.parseInt(stringArray2[i])){
                return 1;
            }else if(Integer.parseInt(stringArray1[i]) < Integer.parseInt(stringArray2[i])){
                return -1;
            }
        }
        for (int j = length; j < stringArray1.length; j++){
            if (Integer.parseInt(stringArray1[j]) > 0) result = 1;
        }
        return result;
    }
}
