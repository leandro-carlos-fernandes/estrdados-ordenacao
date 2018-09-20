package ordenacao.insercao;

public class InsertionSort {
	
	public static void sort(int[] dados) {
		for (int i = 1; i < dados.length; i++) {
			int pos = i;
			int temp = dados[i];
			while ((pos > 0) && (temp < dados[pos-1])) {
				dados[pos] = dados[pos-1];
				pos--;
			}
			dados[pos] = temp;
		}
	}

}