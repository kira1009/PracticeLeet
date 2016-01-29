/**
 * Created by cagekira on 1/29/16.
 */
public class VersionNumber {
    public static void main(String[] args){
        String s1 = "1";
        String s2 = "2";
        int i = compareVersion(s1, s2);
        System.out.println(i);
    }
    public static int compareVersion(String version1, String version2) {
        String[] v1 = new String[2];
        String[] v2 = new String[2];
        if (version1.split("\\.").length < 2){
            v1[0] = version1.split("\\.")[0];
            v1[1] = "0";
        }else{
            v1 = version1.split("\\.");
        }
        if (version2.split("\\.").length < 2){
            v2[0] = version2.split("\\.")[0];
            v2[1] = "0";
        }else{
            v2 = version2.split("\\.");
        }
        int preVersion1 = Integer.parseInt(v1[0]);
        int preVersion2 = Integer.parseInt(v2[0]);
        int postVersion1 = Integer.parseInt(v1[1]);
        int postVersion2 = Integer.parseInt(v2[1]);
        if(preVersion1 > preVersion2){
            return 1;
        }else if (preVersion1 < preVersion2){
            return -1;
        }else{
            if(postVersion1 > postVersion2){
                return 1;
            }else if(postVersion1 < postVersion2){
                return -1;
            }else{
                return 0;
            }
        }
    }


}
