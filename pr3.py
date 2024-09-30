a=int(input())
b=int(input())
c=int(input())
if a<b:
    if a<c:
        y=a
    else:
        y=c
else:
    if b<c:
        y=b
    else:
        y=c
print("Минимальное:",y)