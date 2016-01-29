
public class LengthofLastWord {
	public static void main(String[] args){
		String s = "s";
		System.out.println(lengthOfLastWord(s));
	} 
	
	public static int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        String a = ss[ss.length-1];
        return a.length();
    }
}
