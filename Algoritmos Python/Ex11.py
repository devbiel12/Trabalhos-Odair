A = int(input("Digite o valor de A da equação: "))
B = int(input("Digite o valor de B da equação: "))
C = int(input("Digite o valor de C da equação: "))

delta = (B**2)-4*A*C;

print(f'O valor de delta da expressão {A}x²+({B})x+({C}) é {delta}')

# Entrada
# A = lista1, lista2, lista3, lista4
# n = 4
# x = A, B, C, delta
# Saida
# 1 Ajustar a reposta para NOT FOUND
# 2 Para cada indice i em A:
#   Se A[i] = x de cada lista e se (lista2[i]*lista2[i])-4*lista1[i]*lista3[i] = lista4[i], ajustar i como resposta
# 3 Retornar a resposta como saida.