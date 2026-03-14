from typing import List

# def flip(boxGrid: List[List[str]]) -> List[List[str]]:
def rotateTheBox(boxGrid: List[List[str]]) -> List[List[str]]:
    output = [["" for _ in range(len(boxGrid))] for _ in range(len(boxGrid[0]))]
    # print(str(output))
    #for each column, move any stones down
    stack = []
    m, n = len(boxGrid), len(boxGrid[0])

    for row in range(0,len(boxGrid)):
        stack=[]
        openSq = -1
        for col in range(len(boxGrid[0])-1,-1,-1):
            print(str(col))
            if boxGrid[row][col] == '.':
                stack.append(col)
            elif boxGrid[row][col] == '#':
                if len(stack) > 0:
                    openSq = stack.pop()
                    boxGrid[row][openSq] = '#'
                    boxGrid[row][col] = '.'
            elif boxGrid[row][col] == '*':
                stack.clear()  # obstacle blocks movement across it

            print(str(openSq))
    output = [['.' for _ in range(m)] for _ in range(n)]
    for r in range(m):
        for c in range(n):
            output[c][m - 1 - r] = boxGrid[r][c]

    print(str(boxGrid))
    print(str(output))

if __name__ == "__main__":
    boxGrid = [["#",".","#"]]
    boxGrid2 = [["#",".","*","."],
              ["#","#","*","."]]
    rotateTheBox(boxGrid)
    rotateTheBox(boxGrid2)