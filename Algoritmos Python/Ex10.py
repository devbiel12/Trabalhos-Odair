largura = float(input('Digite a largura da parade: '))
altura = float(input('Digite a altura da parede: '))
area = largura * altura
qtd_tinta = area/2
print(f'"A area a ser pintada é de {area}m² e a quantidade de latas de tinta para pintar a parede será {qtd_tinta} baldes de tinta')

# Entrada
# A = lista1, lista2, lista3, lista4
# n = 4
# x = largura, altura, area, qtde_tintas
# Saida
# 1 Ajustar a reposta para NOT FOUND
# 2 Para cada indice i em A:
#   Se A[i] = x de cada lista e se lista1[i] * lista2[i] = lista3[i] e se lista3[i]/2 = lista4[i], ajustar i como resposta
# 3 Retornar a resposta como saida.