/**
 * Created by cagekira on 6/3/16.
 */
import java.util.*;

public class IntersectionTwoArr {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List list;
        if(nums1.length < nums2.length){
            list = findIntersection(nums1, nums2);
        }else{
            list = findIntersection(nums2, nums1);
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = (int)list.get(i);
        }
        return res;
    }
    public static List findIntersection(int[] nums1, int[] nums2){
        List resList = new ArrayList();
        int i = 0;
        for(; i < nums1.length; i++){
            while(i < nums1.length - 1 && nums1[i] == nums1[i + 1]){
                i++;
            }
            int target = nums1[i];
            int low = 0, high = nums2.length;
            while(low < high){
                int mid = (low + high)/2;
                if(target > nums2[mid]){
                    low = mid + 1;
                }else if(target < nums2[mid]){
                    high = mid - 1;
                }else{
                    resList.add(nums1[i]);
                    break;
                }
            }
        }
        return resList;
    }

    public static void main(String[] args){
        int[] i1 = new int[]{1};
        int[] i2 = new int[]{1,2};
        int[] res = intersection(i1,i2);
        for(int i : res){
            System.out.print(i);
        }
    }
}
