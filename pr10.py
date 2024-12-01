with open('Ткачев Даниил Александрович_У-243_vvod.txt', 'r') as fl:
    lines = fl.readlines()

matrix = []
for line in lines:
    cl = line.replace('[', '').replace(']', '').replace(',', '').strip()
    if cl: 
        row = list(map(int, cl.split()))
        matrix.append(row)
result_matrix = []
for row in matrix:
    if row:  
        min_value = min(row)
        new_row = [(1 if min_value % 2 == 0 else 0) if x == min_value else x for x in row]
        result_matrix.append(new_row)
with open('Ткачев Даниил Александрович_У-243_vivod.txt', 'w') as fl:
    for i in result_matrix:
        fl.write(' '.join(map(str, sorted(i))) + "\n")

