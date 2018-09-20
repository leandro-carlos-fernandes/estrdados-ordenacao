# Ordena��o de Dados

Entendemos por _ordena��o de dados_ o processo que organiza os elementos de um conjunto segundo uma rela��o de ordem com a qual se atribui, em geral, uma seq��ncia de sucess�o aplic�vel a todo elemento.

## Compromisso:

> A complexidade da ordena��o da estrutura de dados n�o deve exceder a complexidade da computa��o a ser feita na estrutura sem o processo de ordena��o.

Em outras palavras, n�o se deve gastar tempo para ordenar um conjunto de dados se a procura pela informa��o no conjunto desordenado demandar menos, ou at� o mesmo, esfor�o computacional.

### Estrat�gias:

- *troca*: ordena os dados comparando-os dois-a-dois e realizando sucessivas trocas entre os pares de elementos.
- *sele��o*: ordena os elemento atrav�s de sucessivas sele��es do menor (ou maior) valor de um segmento n�o-ordenado e o posiciona ao final do segmento ordenado.
- *inser��o*: ordena o conjunto de dados retirando cada elemento da parte n�o ordenada e inserindo-o no parte ordenada, mas colocando-o em sua posi��o correta.


### Algoritmos:

- Ordena��o por troca:
	- BubbleSort (m�todo da bolha)
	- QuickSort (m�todo da troca e parti��o)

- Ordena��o por inser��o:
	- InsertionSort (m�todo da inser��o direta)
	- ShellSort (m�todo de incrementos decrescentes)

- Ordena��o por sele��o:
	- SelectionSort (m�todo da sele��o direta)
	- HeapSort (m�todo da sele��o em �rvore)

- Outros m�todos:
	- MergeSort (m�todo da intercala��o)
	- BucketSort (m�todo da distribui��o de chave)

Outras informa��es, tais como: caracter�sticas, funcionamento e desempenho podem ser encontradas nos [slides](https://sites.google.com/site/profleandrocfernandes/disciplinas/estrdados/ED-Ordena.pdf) de aula que utilizo para explicar esse tema.