/**
 * This is a demo task.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 * 
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * 
 * Given A = [1, 2, 3], the function should return 4.
 * 
 * Given A = [−1, −3], the function should return 1.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [−1,000,000..1,000,000]. Copyright 2009–2021 by
 * Codility Limited. All Rights Reserved. Unauthorized copying, publication or
 * disclosure prohibited.
 */

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MissingInteger {
    public int solution(int[] A) {
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int x : A) {
            hset.add(x);
        }
        int n = 100001;
        for (int i = 1; i <= n; i++) {
            if (!hset.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
