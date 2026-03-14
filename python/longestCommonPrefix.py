from typing import List


def longestCommonPrefix(arr1: List[int], arr2: List[int]) -> int:
    length = 0
    lens=[]
    for a1 in range(0,len(arr1)):
        for a2 in range(0,len(arr2)):
            str1, str2 = str(arr1[a1]), str(arr2[a2])
            str3=""
            if len(str1) >= len(str2):
                str3=str1.replace(str2,"")
                lens.append(len(str1)-len(str3))
                print(str3)
            else:
                str3=str2.replace(str1,"")
                print(str3)
                lens.append(len(str2)-len(str3))
            i=0
            # while i < len(str1) and i < len(str2):
            #     if str1[i] != str2[i]:
            #         break
                
            #     i+=1
            length = 0
    return(max(lens))

if __name__ == "__main__":
    arr1 = [10]
    arr2 = [17, 11]
    result = longestCommonPrefix(arr1, arr2)
    print(str(result))
