class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxSum = 0
        numsSorted = sorted(nums)
        while len(numsSorted) > 0:
            lowest = numsSorted[0]
            numsSorted.remove(lowest)
            maxSum += lowest
            numsSorted.remove(numsSorted[0])
        return maxSum
