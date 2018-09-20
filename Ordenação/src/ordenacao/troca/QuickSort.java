package ordenacao.troca;

public class QuickSort {
	
	private static void troca(int[] dados, int i, int j) {
		int temp = dados[i];
		dados[i] = dados[j];
		dados[j] = temp;
	}
	
	public static void sort(int[] dados) {
		sort(dados, 0, dados.length - 1);
	}
	
	public static void sort(int[] dados, int esquerda, int direita) {
		int i = esquerda;	int j = direita;
		int x = dados[(esquerda+direita)/2]; //Elemento "pivot"
		do {
			while ((dados[i] < x) && (i < direita)) i++;
			while ((dados[j] > x) && (j > esquerda)) j--;
			if (i <= j) {
				troca(dados,i,j); i++; j--;
			}
		}
		while (i <= j);
		if (esquerda < j) sort(dados,esquerda,j);
		if (i < direita) sort(dados,i,direita);
	} 

}
