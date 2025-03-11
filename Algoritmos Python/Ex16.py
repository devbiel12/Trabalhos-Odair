qtde_cigarros = int(input("Quantidade de cigarros fumados por dia: "))
qtde_anos = int(input("Quantidade de anos fumando: "))

tempo_perdido_dia = 10 * qtde_cigarros
qtde_total = tempo_perdido_dia * (365 * qtde_anos)
dias_perdidos = qtde_total // 1440

print(f"A quantidade de dias de vida perdidos por fumar {qtde_cigarros} cigarros por dia é {dias_perdidos} dias.")

# Entrada
# A = lista1, lista2, lista3, lista4, lista5
# n = 5
# x = qtde_cigarros, qtde_anos, tempo_perdido_dia, qtde_total, dias_perdidos
# Saida
# 1 Ajustar a reposta para NOT FOUND
# 2 Para cada indice i em A:
#   Se A[i] = x de cada lista e se lista1[i]*10 = lista3[i]
#   e se lista3[i]*365*lista2[i] = lista4[i]
#   e se lista4[i] // 1440 = lista5[i] 
#   ajustar i como resposta
# 3 Retornar a resposta como saida.