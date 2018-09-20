# Ordenação de Dados

Entendemos por _ordenação de dados_ o processo que organiza os elementos de um conjunto segundo uma relação de ordem com a qual se atribui, em geral, uma seqüência de sucessão aplicável a todo elemento.

## Compromisso:

> A complexidade da ordenação da estrutura de dados não deve exceder a complexidade da computação a ser feita na estrutura sem o processo de ordenação.

Em outras palavras, não se deve gastar tempo para ordenar um conjunto de dados se a procura pela informação no conjunto desordenado demandar menos, ou até o mesmo, esforço computacional.

### Estratégias:

- *troca*: ordena os dados comparando-os dois-a-dois e realizando sucessivas trocas entre os pares de elementos.
- *seleção*: ordena os elemento através de sucessivas seleções do menor (ou maior) valor de um segmento não-ordenado e o posiciona ao final do segmento ordenado.
- *inserção*: ordena o conjunto de dados retirando cada elemento da parte não ordenada e inserindo-o no parte ordenada, mas colocando-o em sua posição correta.


### Algoritmos:

- Ordenação por troca:
	- BubbleSort (método da bolha)
	- QuickSort (método da troca e partição)

- Ordenação por inserção:
	- InsertionSort (método da inserção direta)
	- ShellSort (método de incrementos decrescentes)

- Ordenação por seleção:
	- SelectionSort (método da seleção direta)
	- HeapSort (método da seleção em árvore)

- Outros métodos:
	- MergeSort (método da intercalação)
	- BucketSort (método da distribuição de chave)

Outras informações, tais como: características, funcionamento e desempenho podem ser encontradas nos [slides](https://sites.google.com/site/profleandrocfernandes/disciplinas/estrdados/ED-Ordena.pdf) de aula que utilizo para explicar esse tema.