
public class RemoveElement {

	public static void main(String[] args) {
		int[] a = {4,5};
		System.out.println(removeElement(a,4));
	}

	public static int removeElement(int[] nums, int val) {
		int length = 0;
		int j = 0;
		if (nums == null)
			return length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
//				nums[length] = nums[i];
				length++;
			}
		}
		int[] num = new int[length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				num[j] = nums[i];
				j++;
			}
		}
		nums = num;
		return length;
	}

}
