import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by cagekira on 2/11/16.
 */
public class Permutation {
    public static void main(String[] args){
//        permute(new int[]{1,2,3});
        int[] x = new int[1];
        System.out.println(x[0]);
        test(x);
        System.out.println(x[0]);
    }
    /**
    public static List<List<Integer>> permute(int[] nums) {
        if (nums == null) return null;
       */List<List<Integer>> result = new ArrayList<List<Integer>>();
//        result.remove();
        /**List<Integer> tmp = new ArrayList<Integer>();
        LinkedList test = new LinkedList<>();
        test.removeFirst();
        String s = "";
        StringBuilder sb = new StringBuilder();
        sb.append();
//        result.add(tmp);
        for(int i = 0; i < nums.length; i++){
            List<List<Integer>> tmpResult = new ArrayList<List<Integer>>();
            for(List<Integer> li : result){
                for(int j = 0; j < li.size() + 1; j++){
                    li.add(j,nums[i]);
                    List<Integer> swap= new ArrayList<Integer>(li);
                    tmpResult.add(swap);
                    li.remove(j);
                }
                result = new ArrayList<List<Integer>>(tmpResult);
            }
        }
        return result;
    }*/

    public static boolean test(int[] n){
        n[0] = 100;
        return true;
    }

}
