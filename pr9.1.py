from random import randint
n,m=3,4
a=[[randint(-50,50)for _ in range(m)]for _ in range(n)]
for i in a:
    print(*sorted(i))