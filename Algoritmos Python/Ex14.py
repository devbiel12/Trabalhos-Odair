qtd_kms = float(input('Digite a quantidade de KM rodados'))
dias_alugadas = int(input('Digite a quantidade de dias alugados'))
preco_total = 90*dias_alugadas + 0.20&qtd_kms
print(f'O valor total a ser pago será R${preco_total:.2f}')

# Entrada
# A = lista1, lista2, lista3
# n = 3
# x = qtd_kms, dias_alugadas, preco_total
# Saida
# 1 Ajustar a reposta para NOT FOUND
# 2 Para cada indice i em A:
#   Se A[i] = x de cada lista e se lista1[i]*0.20 + lista2[i]*90 = lista3[i], ajustar i como resposta
# 3 Retornar a resposta como saida.