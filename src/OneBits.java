
public class OneBits {

	public static int hammingWeight(int n) {
		int count = 0;
		String s = Integer.toBinaryString(n);
		for (char c : s.toCharArray()){
			System.out.println(c);
			if (c == '1'){
				count++;
			}
		}
		return count;
    }
	
	public static void main(String[] args){
		int test = 2;
		System.out.println(hammingWeight(test));
	}
}
