def f(m):
    new_m=[ ]
    for x in m:
        if x not in new_m:
            new_m.append(x)
    return new_m
m = [5, 8, 1, 5, 9, 1, 6, 8, 1, 3]
new_m = f(m)
print(new_m)