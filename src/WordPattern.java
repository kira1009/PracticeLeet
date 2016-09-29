/**
 * Created by cagekira on 5/15/16.
 */
import java.util.HashMap;
public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        char[] pat = pattern.toCharArray();
        String[] strArray = str.split(" ");
        if(pat.length != strArray.length) return false;
        HashMap ht1 = new HashMap();
        HashMap ht2 = new HashMap();
        for(int i = 0; i < pat.length; i++){
            if(!ht1.containsKey(pat[i])){
                ht1.put(pat[i], strArray[i].trim());
            }else{
                if(!ht1.get(pat[i]).equals(strArray[i].trim())) return false;
            }
            if(!ht2.containsKey(strArray[i].trim())){
                ht2.put(strArray[i].trim(), pat[i]);
            }else{
                if((char)ht2.get(strArray[i].trim()) != pat[i]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String a = "abba";
        String b = "dog cat cat dog";
        System.out.print(wordPattern(a,b));
    }
}
