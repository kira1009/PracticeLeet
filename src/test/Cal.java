package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by cagekira on 7/11/16.
 */
public class Cal {
    public static void main(String[] args){
        String s = "9780201101799";
        char[] c = s.toCharArray();
        int res = 0;
        for(int i = 0; i < c.length; i++){
            if(i % 2 == 1){
                res += 3 * Integer.parseInt(String.valueOf(c[i]));
            }else {
                res += Integer.parseInt(String.valueOf(c[i]));
            }
        }
        System.out.print(res);
        ArrayList list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            ent.getKey();
            ent.getValue();
        }
    }

}
