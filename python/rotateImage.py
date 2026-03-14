from typing import List


def rotate(matrix: List[List[int]]) -> None:
    """
    Do not return anything, modify matrix in-place instead.
    """
    dist = 1
    trow = 0
    for newCol in range(len(matrix[0])-1,-1,-1):
        row, col = 0, 0
        for newRow in range(0,len(matrix)):
            temp = matrix[newRow][newCol]
            if col == len(matrix[0])-1:
                col = 0
            matrix[newRow][newCol] = matrix[row][col]
            matrix[row][col] = temp
            col+=1
        row+=1
        
    return matrix

if __name__ == "__main__":
    matrix = [[1,2,3],[4,5,6],[7,8,9]]
    rotate(matrix)
    print(str(matrix))