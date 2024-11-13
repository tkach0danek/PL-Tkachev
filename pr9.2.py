from random import randint
n,m=3,4
a=[[randint(-50,50)for _ in range(m)]for _ in range(n)]
print(list([(1 if min(i)%2 else 0)if j==min(i)else j for j in i]for i in a))