class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        i=0
        if str1 == str2:
            return str1
        if len(str1) > len(str2):
            if str1[0:len(str2)] != str2:
                return ""
            else:
                gcd = self.gcd(len(str1), len(str2))
                return str1[0:gcd]
                # while str2 in str1:
                # i+=1
                # str1 = str1.replace(str2,"")
            # print(str2[0:i+1])
            # return str1
        if len(str2) > len(str1):
            if str2[0:len(str1)] != str1:
                return ""   
            else:
                gcd = self.gcd(len(str1), len(str2))
                return str2[0:gcd]
                # return str2[0:len(str1)]
            # while str1 in str2:
            #     str2 = str2.replace(str1,"")
            # print(str1[0:i+1])
            # return str2
        return ""   
    def gcd(self,a, b):
        a,b = 21, 70
        while b:
            a, b = b, a % b
        return a

    """
    gcd of 48, 36


    """
if __name__ == "__main__":
    sol = Solution()
    print("test 1-> : " + sol.gcdOfStrings("ABCABC", "ABC"))  # Output: "ABC"
    print("test 2 -> : " + sol.gcdOfStrings("ABABAB", "ABAB"))
    print("test 3 -> : " + sol.gcdOfStrings("LEET", "CODE"))
    print("gcd 48, 36 = " + str(sol.gcd(48,36)))
# if __main__