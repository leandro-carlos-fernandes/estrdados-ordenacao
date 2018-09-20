package ordenacao.troca;

public class BubbleSort {
	
	private static void troca(int[] dados, int i, int j) {
		int temp = dados[i];
		dados[i] = dados[j];
		dados[j] = temp;
	}
	
	public static void sort(int[] dados) {
		int tam = dados.length;
		for (int i = 0; i < tam-1; i++) {
			for (int j = i+1; j <= tam-1; j++) {
				if (dados[j] < dados[i]) {
					troca(dados, i, j);
				}
			}
		}
	}

}