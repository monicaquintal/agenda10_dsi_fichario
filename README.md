# agenda10_dsi_fichario
Resolução da atividade proposta no Fichário da Agenda 10 (disciplina DSI) da ETEC, utilizando Matrizes.

"Paulo, o estudante do Ensino Médio que você conheceu no Mergulhando no Tema, agora deseja criar um programa que realize a soma de todos os elementos de uma matriz 10x10, contendo números inteiros. Elabore o pseudocódigo e a codificação em linguagem Java de um software que resolva o problema de Paulo.
IMPORTANTE: O programa deverá solicitar a digitação dos valores e armazenar numa matriz 10x10."

PSEUDOCÓDIGO

Programa monicaQuintal_fichario_agenda10_dsi

Declare<br>
matrizA como conjunto [1..10][1..10] de inteiro<br>
matrizB como conjunto [1..10][1..10] de inteiro<br>
matrizC como conjunto [1..10][1..10] de inteiro<br>
linha, coluna como inteiro<br>
<br>
Início<br>
Escreva ("inserindo os dados na Matriz A")<br>
Para linha = 1 Até 10 Faça<br>
   Para coluna = 1 até 10 Faça<br>
	Escreva ("Entre com um número")<br>
	Escreva ("linha", linha)<br>
	Escreva ("coluna", coluna)<br>
	Leia a[linha,coluna]<br>
   Fim-Para<br>
Fim-Para<br>
<br>
Escreva ("inserindo os dados na Matriz B")<br>
Para linha = 1 Até 10 Faça<br>
   Para coluna = 1 até 10 Faça<br>
	Escreva ("Entre com um número")<br>
	Escreva ("linha", linha)<br>
	Escreva ("coluna", coluna)<br>
	Leia a[linha,coluna]<br>
   Fim-Para<br>
Fim-Para<br>
<br>
Escreva("calculando Matriz C")<br>
Para linha = 1 Até 10 Faça<br>
   Para coluna = 1 até 10 Faça<br>
	Escreva ("linha", linha)<br>
	Escreva ("coluna", coluna)<br>
	Escreva ("valor calculado", c[linha][coluna)<br>
   Fim-Para<br>
Fim-Para<br>
<br>
