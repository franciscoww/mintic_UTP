cubo = [
	[ [1,  2],  [3,   4]], #arriba
	[ [5,  6],  [7,   8]], #derecha
	[ [9,  10], [11,  12]], #frente
	[[13,  14], [15,  16]], #izquierda
	[[17,  18], [19,  20]], #atras
	[[21,  22], [23,  24]]  #abajo
]

print('\n*****Elementos del lado izquierdo de cada cara del cubo*****\n')

for a in cubo:
	for n in a:
    		print(n[0], end=', ')

print('\n\n*****Elementos del lado derecho de cada cara del cubo*****\n')

for a in cubo:
	for n in a:
    		print(n[1], end=', ')

print('\n\n***Elementos primera fila cada cara***\n')
for b in cubo:
	print(b[0],end=', ')

print('\n\n***Elementos segunda fila cada cara***\n')
for b in cubo:
	print(b[1],end=', ')

print('\n\n*******Todos los elementos 1 a 1*******\n')

for numeros in cubo:
	 for num in numeros:
			for k in num:
	    			print(k, end=', ')
print('\n\n***********************************\n')