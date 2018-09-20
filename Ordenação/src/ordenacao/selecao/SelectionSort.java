package ordenacao.selecao;

public class SelectionSort {
	
	public static void sort(int[] dados) {
		for (int i = 0; i < dados.length-1; i++) {
			int posMenor = i;
			for (int j = i+1; j < dados.length; j++)
				if (dados[j] < dados[posMenor])
					posMenor = j;
			if (posMenor != i) {
				int temp = dados[i];
				dados[i] = dados[posMenor];
				dados[posMenor] = temp;
			}
		}
	}
	
}
