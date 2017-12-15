#Given a positive integer, output its complement number.
class Solution(object):
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        dec = num
        bin = ""
        sigBin = ""
        result = 0
        while dec > 0 :
            bin = bin + str(dec % 2)
            dec = dec / 2
        for char in bin:
            if char == "0":
                sigBin = sigBin + "1"
            else :
                sigBin = sigBin + "0"
        for i in xrange(0 , len(sigBin)-1):
            result += int(sigBin[i]) * 2**i
        return result
