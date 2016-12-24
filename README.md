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
Solution: Using bit >>> which is unsigned shift to handle negative numbers

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

Number: [`39`](https://leetcode.com/problems/combination-sum/) [`40`](https://leetcode.com/problems/combination-sum-ii/) [`216`](https://leetcode.com/problems/combination-sum-iii/) Category: Backtrack, DP  
Solution: 39. somehow like 401, using backtracking we need to limit the boundary which is the remainder less than 0. And the termination criteria that remainder equals 0.
In the iteration of the recursion the element which added in the list should be removed after testing the results with such starting sequence.  
40.a bit different from 39, first the recursion call must be index + 1 for each call helper, second in order to eliminate the duplicated results we have to record every previous added element.  
216.a easier one, the numbers starts from 1 to 9. Using backtracking, like 39, every time you index increase by 1.

Number: [`409`](https://leetcode.com/problems/longest-palindrome/) Category: String, Palindrome  
Solution: first count the number of appearances of each character for each character if the number is even we just add its number else if is odd and larger than 2 just add the number minus 1.
At last if the result is less than the string's length it means there is at least one odd character so add 1 to the result.

Number: [`22`](https://leetcode.com/problems/generate-parentheses/) Category: Backtracking  
Solution: using backtracking the termination criteria is the string's length equal to 2n. If left parentheses is less than n add ( to the current string for the recursion,
if left parentheses is n or right is smaller than left then add ) to the recursion.

Number: [`137`](https://leetcode.com/problems/single-number-ii/) Category: Bit Manipulation  
Solution: one = (one ^ num) & ~two; two = (two ^ num) & ~one; one record the digit appeared once, two record the digit appeared twice if 3 times two will return to 0.

Number: [`241`](https://leetcode.com/problems/different-ways-to-add-parentheses/) Category: Divide and Conquer  
Solution: go through the input string, when a symbol is met, divide it into a previous part and a post part then parse the previous and post ones separately and get the result list.
Do (+-*) for each element in the two lists and store their results into an output list and return. To make the calculation faster use a Map to memorize the calculated <String, List> pair.

Number: [`108`](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) Category: DFS  
Solution: Divide the array into 3 parts. Current value: the middle value; previous numbers of middle value; post numbers of middle value. Using recursion generate Node n, its left is smaller node, right is bigger node.

Number: [`394`](https://leetcode.com/problems/decode-string/) Category: DFS, Stack  
Solution: 1.use stack, store the number of iterations of string and string in [] into 2 stacks. When ] is met get the Stringbuilder in the strStack and append the i * str in [] then set the current stringbuilder to its result.  
2. Using dfs, when '[' is met call dfs passing the remaining string and current index, when ']' is met return the parsed string.

Number: [`96`](https://leetcode.com/problems/unique-binary-search-trees/) Category: DP  
Solution: Use DP, by analyze the example we can see for a n nodes tree its children can be left: 0, right: n-1; left: 1, right: n-2; left: 2, right: n-3;...... So we use bottom up method to calculate the n nodes tree's result.

Number: [`5`](https://leetcode.com/problems/longest-palindromic-substring/) Category: String  
Solution: Iterate throw the array and consider the ith element as the middle of the palindrome and use two pointers to move different directions of the string find the longest palindrome and update the maximum length and the start position of the string.
 
Number: [`413`](https://leetcode.com/problems/arithmetic-slices/) Category: DP  
Solution: If the ith element is equal to the previous gap this means all the slices in ith element will grow by one, for 5 continuous numbers the sum is 4 + 3 + 2 + 1 which is the sum.  

Number: [`239`]  
Number: [`419`]  
Number: [`309`]  
Number: [`89`]  
Number: [`62`]  
Number: [`35`]  
Number: [`153`]  
Number: [`199`]  
Number: [`173`]  