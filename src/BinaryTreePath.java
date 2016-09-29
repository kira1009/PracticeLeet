/**
 * Created by cagekira on 5/26/16.
 */
import java.util.*;
public class BinaryTreePath {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> resList = new ArrayList<String>();
        List<String> lList = new ArrayList<String>();
        List<String> rList = new ArrayList<String>();
        if(root == null) return resList;
        String s = String.valueOf(root.val);
        if(root.left != null){
            lList = dfsPath(s, root.left);
        }else if(root.right != null){
            rList = dfsPath(s, root.right);
        }else{
            resList.add(s);
        }
        resList.addAll(lList);
        resList.addAll(rList);
        return resList;
    }

    /**
     *
     * @param s
     * @param node
     * @return
     */
    public static List<String> dfsPath(String s, TreeNode node){
        List<String> resList = new ArrayList<String>();
        List<String> lList = new ArrayList<String>();
        List<String> rList = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        sb.append(s).append("->").append(node.val);
        if(node.left != null){
            lList = dfsPath(sb.toString(), node.left);
        }else if(node.right != null){
            rList = dfsPath(sb.toString(), node.right);
        }else{
            resList.add(sb.toString());
        }
        resList.addAll(lList);
        resList.addAll(rList);
        return resList;
    }

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        List<String> l = binaryTreePaths(t1);
        for(String s : l){
            System.out.println(s);
        }
    }
}

