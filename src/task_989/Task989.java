package task_989;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/*
The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
 */
public class Task989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : num) {
            stringBuilder.append(i);
        }
        BigDecimal number = new BigDecimal(stringBuilder.toString());
        BigDecimal sum = number.add(new BigDecimal(k));
        String stringSum = String.valueOf(sum);
        System.out.println(stringSum);
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < stringSum.length(); i++) {
            result.add(Integer.valueOf(Character.toString(stringSum.charAt(i))));
        }
        return result;
    }

}
