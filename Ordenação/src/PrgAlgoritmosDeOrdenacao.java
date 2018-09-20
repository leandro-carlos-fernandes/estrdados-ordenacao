import ordenacao.troca.*;
import ordenacao.insercao.*;
import ordenacao.outros.*;
import ordenacao.selecao.*;

/**
 * Programa exemplo que ordena um conjunto de dados num�rico, usando diferentes
 * algoritmos e os compara atrav�s de tomadas de tempo para an�lise de
 * desempenho.
 * 
 * @author Leandro Fernandes
 */
public class PrgAlgoritmosDeOrdenacao {

	public static void main(String[] args) {
		long tInicio, tFim;

		// Vamos criar um conjunto de valores inteiros, sorteados aleatoriamente para
		// servir de entrada para os algoritmos de ordena��o
		System.out.println("Gerando conjunto de dados ...");
		System.out.print("[");
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100);
			System.out.print(" " + vetor[i]);
		}
		System.out.println(" ]\n");

		/*
		 * Para comparar o desempenho dos diferentes algoritmos conv�m test�-los com o
		 * mesmo conjunto de dados. Assim vamos criar v�rias c�pias do nosso conjunto de
		 * dados, uma para cada um dos algoritmos que ser�o testados.
		 */
		int[] dadosBubble = criarCopia(vetor);
		int[] dadosQuick = criarCopia(vetor);
		int[] dadosInsertion = criarCopia(vetor);
		int[] dadosShell = criarCopia(vetor);
		int[] dadosSelection = criarCopia(vetor);
		int[] dadosMerge = criarCopia(vetor);
		int[] dadosBucket = criarCopia(vetor);

		// Testando o BubbleSort ...
		tInicio = System.nanoTime();
		BubbleSort.sort(dadosBubble);
		tFim = System.nanoTime();
		System.out.println("Tempo gasto pelo BubbleSort...: " + (tFim - tInicio) / 1000 + " microsegundos.");
		mostrarDados(dadosBubble);

		// Testando o QuickSort ...
		tInicio = System.nanoTime();
		QuickSort.sort(dadosQuick);
		tFim = System.nanoTime();
		System.out.println("Tempo gasto pelo QuickSort....: " + (tFim - tInicio) / 1000 + " microsegundos.");
		mostrarDados(dadosQuick);

		// Testando o InsertionSort ...
		tInicio = System.nanoTime();
		InsertionSort.sort(dadosInsertion);
		tFim = System.nanoTime();
		System.out.println("Tempo gasto pelo InsertionSort: " + (tFim - tInicio) / 1000 + " microsegundos.");
		mostrarDados(dadosInsertion);

		// Testando o ShellSort ...
		tInicio = System.nanoTime();
		ShellSort.sort(dadosShell);
		tFim = System.nanoTime();
		System.out.println("Tempo gasto pelo ShellSort....: " + (tFim - tInicio) / 1000 + " microsegundos.");
		mostrarDados(dadosShell);

		// Testando o SelectionSort ...
		tInicio = System.nanoTime();
		SelectionSort.sort(dadosSelection);
		tFim = System.nanoTime();
		System.out.println("Tempo gasto pelo SelectionSort: " + (tFim - tInicio) / 1000 + " microsegundos.");
		mostrarDados(dadosSelection);

		// Testando o MergeSort ...
		tInicio = System.nanoTime();
		MergeSort.sort(dadosMerge);
		tFim = System.nanoTime();
		System.out.println("Tempo gasto pelo MergeSort....: " + (tFim - tInicio) / 1000 + " microsegundos.");
		mostrarDados(dadosMerge);
		
		// Testando o BucketSort ...
		tInicio = System.nanoTime();
		BucketSort.sort(dadosBucket, 0, 100);
		tFim = System.nanoTime();
		System.out.println("Tempo gasto pelo BucketSort....: " + (tFim - tInicio) / 1000 + " microsegundos.");
		mostrarDados(dadosBucket);

		System.exit(0);
	}

	/**
	 * M�todo auxiliar que apresenta um conte�do de valores na tela.
	 * 
	 * @param vetor conjunto de n�meros inteiros.
	 */
	private static void mostrarDados(int[] vetor) {
		System.out.print("Conjunto ap�s a ordena��o: [");
		for (int i = 0; i < vetor.length; i++)
			System.out.print(" " + vetor[i]);
		System.out.println(" ]\n");
	}

	/**
	 * Cria uma c�pia de um conjunto de dados.
	 * 
	 * @param vetor conjunto de n�meros inteiros.
	 * @return c�pia do conjunto informado.
	 */
	private static int[] criarCopia(int[] vetor) {
		int tam = vetor.length;

		int[] copia = new int[tam];
		for (int i = 0; i < tam; i++)
			copia[i] = vetor[i];
		return copia;
	}

}
