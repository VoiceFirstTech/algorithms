/*
 The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.
*/
class Solution {
    public int hammingDistance(int x, int y) {
        // Convert from Decimal to Binary
        Deque<Integer> stackX = new ArrayDeque<Integer>();
        while (x > 0) {
            stackX.push(x%2);
            x = x/2;
        }
        Deque<Integer> stackY = new ArrayDeque<Integer>();
        while (y > 0) {
            stackY.push(y%2);
            y = y/2;
        }
        // Standardize size pf queue
        while (stackY.size() > stackX.size()) {
            stackX.push(0);
        }
        while (stackY.size() < stackX.size()) {
            stackY.push(0);
        }

        // Compare
        int difference = 0;
        while (stackY.size() > 0) {
            if (stackY.pop() != stackX.pop()) {
                difference++;
            }
        }
        return difference;
    }
}
