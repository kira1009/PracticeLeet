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

Number: [`198`](https://leetcode.com/problems/house-robber/) [`213`](https://leetcode.com/problems/house-robber-ii/) [`337`](https://leetcode.com/problems/house-robber-iii/) Category: DP
Solution:
198: iterate with 2 max for odd and even position in the array, every time after add current value for odd/even compare it with even/odd, current odd/even is set to the max value.
213: quite like 198, divide it into two situation: start from 1st without last or start from 2nd with last, and compare their value, get the max one.
337: this one is quite tricky, there are 2 solutions:
1. using recursion, every node has the result as selected or not selected, if selected just get the val plus result of the nodes +2 height, or just return the sum of results of its children.
2. using DP, every node has two conditions selected or not, this will return 2 values so we store the result in a array, for each node the selected value is its value plus its children not selected.
And the not selected is the max of its left child selected and not selected plus max right child selected and not selected.

Number: [`377`](https://leetcode.com/problems/combination-sum-iv/) Category: DP
Solution: combination(target) is sum of all the possible combination(target - num). Using a bottom-up method this problem can be solved.

Number: [`400`](https://leetcode.com/problems/nth-digit/) Category: Math
Solution: every length of integer has 9, 90, 900, etc. numbers, this times length is the total characters in each gap. For the left (n-1)/length is the total passing numbers and every gap has a start
1, 10, 100, etc. By this method we can get the number where the nth digit locates the use the remainder to find the nth digit.

Number: [`397`](https://leetcode.com/problems/integer-replacement/) Category: Math
Solution: for even number just divide it by two and make counter plus 1, for odd number if it is not 3, test n+1 whether can be divided by 4, if so make next number n + 1 else make it n - 1.
Assume n = 2k + 1, (n + 1)/2 is k + 1, (n - 1)/2 is k, whether k or k + 1 is even and even number makes shorter path, so we will test (n + 1)/4

Number: []
