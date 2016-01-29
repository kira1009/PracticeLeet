
public class PowerOfTwo {

	public static void main(String[] args) {
		int i = 2;
		System.out.println(isPowerOfTwo(i));
	}
	
	public static boolean isPowerOfTwo(int n) {
        if (n < 1){
            return false;
        }
        int count = 0;
        for (int i = 0; i < 32; i++){
            if ((n & (1<<i)) != 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
        if (count == 1){
            return true;
        }
        return false;
    }
}
