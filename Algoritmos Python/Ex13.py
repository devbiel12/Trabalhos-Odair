nome = input("Nome do funcionário que receberá aumento:")
salario_old = float(input("Salario do funcionário:"))
salario_novo = salario_old + salario_old * 0.15
print(f'O funcinario {nome} receberá daqui em diante R${salario_novo:.2F}')

# Entrada
# A = lista1, lista2, lista3
# n = 3
# x = nome, salario_old, salario_novo
# Saida
# 1 Ajustar a reposta para NOT FOUND
# 2 Para cada indice i em A:
#   Se A[i] = x de cada lista e se lista2[i]*0,15 + lista2[i] = lista3[i], ajustar i como resposta
# 3 Retornar a resposta como saida.