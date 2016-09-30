# PracticeLeet  
   
The following part is personal summary of Leetcode.  
 
Number: [`404`](https://leetcode.com/problems/sum-of-left-leaves/) Category: Tree  
Basic Solution: For tree we often use recursive method this problem differs from other by judging whether this node is a left tree node.  
                To solve this problem, we add a boolean parameter which is isLeft to judge whether this is the left node calling every iteration.  
Advanced: Not found yet.  

Number: [`401`](https://leetcode.com/problems/binary-watch/) Category: BackTracking
Solution:
Using backtracking this part is weak, need to enhance. Backtracking mostly using recursion.
In your function you have to define on what condition the recursion terminates and how to pass parameter is also tricky.
In this problem, the position cursor iterate from 0 to sum of hour(4) and minute(6), next time num = num - 1, the iteration start position is i + 1.

Number: [`405`](https://leetcode.com/problems/convert-a-number-to-hexadecimal/) Category: Bit Manipulation
Solution:
Using bit >>> which is unsigned shift to handle negative numbers


Number: [`406`](https://leetcode.com/problems/queue-reconstruction-by-height/) Category: Greedy, Comparator, Array
Solution:
1. Arrays.sort() can sort a two dimensional array
2. Arrays.sort(e, Comparator{int compare(){}}) is the basic method to redefine a compare method for the input array
3. ArrayList.toArray(array[] or array[][]) is the method to change the ArrayList into an array
