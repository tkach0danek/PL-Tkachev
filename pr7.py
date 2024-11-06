m = [1,2,-10,-21,5,7,-3,4,-5,-31]
for i in range(len(m)-1):
    if m[i]<0 and m[i+1]<0:
        print(m[i],m[i+1])