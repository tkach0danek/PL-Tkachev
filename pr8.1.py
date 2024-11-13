def gcd(a,b):
    while b:
        a,b=b,a%b
    return a
def sf(a,b,c,d):
    oz=b*d
    n1=a*d
    n2=c*b
    rn=n1-n2
    if rn<0:
        rn=-rn
    sok=gcd(rn,oz)
    return rn//sok,oz//sok
a,b,c,d=map(int,input().split())
rn,rd=sf(a,b,c,d)
print(f"Результат:{rn}/{rd}")

