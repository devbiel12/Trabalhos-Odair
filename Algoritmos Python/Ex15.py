nome = input("Nome do funcionário: ")
qtd_dia = int(input("Digite a quantidade de dias trabalhados: "))
salario = 8 * 25 * qtd_dia
print(f'O salario de {nome} neste mês será R${salario:.2f}')

# Entrada
# A = lista1, lista2, lista3
# n = 3
# x = nome, qtd_dia, salario
# Saida
# 1 Ajustar a reposta para NOT FOUND
# 2 Para cada indice i em A:
#   Se A[i] = x de cada lista e se lista2[i]*8*25 = lista3[i], ajustar i como resposta
# 3 Retornar a resposta como saida.