from typing import List


def spiralOrder(matrix: List[List[int]]) -> List[int]:
    bottomBound, rightBound, topBound, leftBound = len(matrix)-1, len(matrix[0])-1, 0,0
    output=[]
    row, col = 0,0
    while len(output) < (len(matrix) * len(matrix[0]))-1:
        #Traverse L->R
        while col < rightBound:
            output.append(matrix[row][col])
            col+=1
        topBound+=1
        #Traverse T->B
        while row < bottomBound:
            output.append(matrix[row][col])
            row+=1
        rightBound-=1
        #Traverse R->L
        while col > leftBound:
            output.append(matrix[row][col])
            col-=1
        bottomBound -= 1
        #Traverse B->T
        while row > topBound:
            output.append(matrix[row][col])
            row-=1
        leftBound+=1
    return output

if __name__ == "__main__":
    matrix = [[1,2,3],[4,5,6],[7,8,9]]
    matrix2=[[1,2,3,4],[5,6,7,8],[9,10,11,12]]
    matrix3 = [[6,9,7]]
#    nt(str(spiralOrder(matrix)))
    print(str(spiralOrder(matrix33)))