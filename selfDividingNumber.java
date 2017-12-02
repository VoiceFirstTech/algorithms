/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
*/
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<Integer>();
        for (int i = left; i <= right; i++) {
            int j = i;
            boolean selfDividing = true;
            while (j > 0) {
                int divisor = j % 10;
                if (divisor == 0) {
                    selfDividing = false;
                } else if (i % divisor != 0) {
                    selfDividing = false;
                }
                j = j / 10;
            }
            if (selfDividing) {
                result.add(i);
            }
        }
        return result;
    }
}
