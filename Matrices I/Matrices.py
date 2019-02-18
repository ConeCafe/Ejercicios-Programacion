A = [[1, 4, 5, 12],
     [-5, 8, 9, 0],
     [-6, 7, 11, 19],
     [0, 1, 1, 0]]
B = [[1, 4, 5, 6, 7],
     [-5, 8, 9, 6 ,7],
     [-5, 8, 10, 6 ,7],
     [-5, 8, 9, 6 ,7],
     [-6, 7, 11, 6, 7]]



print("A= ", A)
print("A[0]= ", A[0])
print("A[1]= ", A[1])
print("A[2]= ", A[2])
print(A[0][0]+A[0][1])


def centro(dd):
    column = []
    for row in dd:
        column.append(row[0])
    i = len(dd[0])
    if(len(dd[0]) != len(column)):
        print("No es una matriz cuadrada.")
        return 0
    if(len(dd[0]) % 2 == 0 and len(column) % 2 == 0):
        suma = dd[(i//2)-1][(i//2)-1] + dd[i//2][(i//2)-1] + dd[(i//2)-1][(i//2)] + dd[(i//2)][(i//2)]
        return suma
    else:
        return dd[(i//2)][(i//2)]
    
print("Suma de los elementos centrales para A: ", centro(A))

print("Suma de los elementos centrales para B: ", centro(B))
