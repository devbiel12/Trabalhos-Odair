nome_produto = input('Digite o nome do produto: ')
valor_produto = int(input('Digite o valor do produto: '))

valor_promo = valor_produto - (valor_produto* 0.05)

print(f'O valor promocional de {nome_produto} é igual a {valor_promo}')

# Entrada
# A = lista1, lista2, lista3
# n = 3
# x = nome, valor, valor_promo
# Saida
# 1 Ajustar a reposta para NOT FOUND
# 2 Para cada indice i em A:
#   Se A[i] = x de cada lista e se lista2[i]*0,05 - lista2[i] = lista3[i], ajustar i como resposta
# 3 Retornar a resposta como saida.