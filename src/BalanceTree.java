
public class BalanceTree {
	public static boolean isBalanced(TreeNode root) {
		boolean flag = true;
		if (root == null) return true;
		int left = height(root.left);
		int right = height(root.right);
		System.out.println("left height: " + left + " right height: " + right);
		if (Math.abs(right - left) > 1) return false;
		flag = flag && isBalanced(root.left) && isBalanced(root.right);
		return flag;
	 }
	private static int height(TreeNode root){
		int length = 0;
		if (root == null) return length;
		if (root.left == null && root.right == null) return 1;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if (leftHeight > rightHeight){
			length = leftHeight + 1;
		}else{
			length = rightHeight + 1;
		}
		return length;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode left1 = new TreeNode(1);
//		TreeNode right1 = new TreeNode(2);
//		TreeNode left21 = new TreeNode(3);
		TreeNode left22 = new TreeNode(2);
//		TreeNode left31 = new TreeNode(4);
//		TreeNode left32 = new TreeNode(4);
//		left21.left = left31;
//		left21.right = left32;
//		left1.left = left21;
		left1.right = left22;
		root.left = left1;
//		root.right = right1;
		Boolean f = isBalanced(root);
		System.out.println(f);
	}

}
