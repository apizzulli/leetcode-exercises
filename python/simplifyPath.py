def simplifyPath(path: str) -> str:
    index = 0
    pathOpen=False
    split = path.split("/")
    # print(str(split))
    finalPath,i  = [], 0
    while i <len(split):
        if len(split[i]) > 0 and split[i] != "." and split[i] != "..":
            split[i] = split[i].replace("/","")
            finalPath.append(split[i])
        elif split[i] == "..":
            if len(finalPath) > 0:
                finalPath.pop(-1)
        i+=1
    print(str(finalPath))
    return "/" + "/".join(finalPath)
    
if __name__ == "__main__":
    # path = "/a//b////c/d//././/.."
    path="/home/foo/./.././bar"
    output = simplifyPath(path)
    print(output)
