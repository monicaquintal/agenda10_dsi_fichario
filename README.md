# agenda10_dsi_fichario
Resolução da atividade proposta no Fichário da Agenda 10 (disciplina DSI) da ETEC, utilizando Matrizes.

"Paulo, o estudante do Ensino Médio que você conheceu no Mergulhando no Tema, agora deseja criar um programa que realize a soma de todos os elementos de uma matriz 10x10, contendo números inteiros. Elabore o pseudocódigo e a codificação em linguagem Java de um software que resolva o problema de Paulo.
IMPORTANTE: O programa deverá solicitar a digitação dos valores e armazenar numa matriz 10x10."

PSEUDOCÓDIGO

Programa monicaQuintal_fichario_agenda10_dsi

Declare
matrizA como conjunto [1..10][1..10] de inteiro
matrizB como conjunto [1..10][1..10] de inteiro
matrizC como conjunto [1..10][1..10] de inteiro
linha, coluna como inteiro

Início
Escreva ("inserindo os dados na Matriz A")
Para linha = 1 Até 10 Faça
   Para coluna = 1 até 10 Faça
	Escreva ("Entre com um número")
	Escreva ("linha", linha)
	Escreva ("coluna", coluna)
	Leia a[linha,coluna]
   Fim-Para
Fim-Para

Escreva ("inserindo os dados na Matriz B")
Para linha = 1 Até 10 Faça
   Para coluna = 1 até 10 Faça
	Escreva ("Entre com um número")
	Escreva ("linha", linha)
	Escreva ("coluna", coluna)
	Leia a[linha,coluna]
   Fim-Para
Fim-Para

Escreva("calculando Matriz C")
Para linha = 1 Até 10 Faça
   Para coluna = 1 até 10 Faça
	Escreva ("linha", linha)
	Escreva ("coluna", coluna)
	Escreva ("valor calculado", c[linha][coluna)
   Fim-Para
Fim-Para
