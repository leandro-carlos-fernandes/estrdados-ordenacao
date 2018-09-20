package ordenacao.insercao;

public class ShellSort {
	
	public static void sort(int[] dados) {	
		int passo = 1;
		do
			passo = 3*passo + 1;
		while (passo < dados.length);
		
		do {
			passo = passo / 3;
			for(int i = passo; i < dados.length; i++) {
				int value = dados[i];
				int j = i - passo;
				while ((j >= 0) && (value < dados[j])) {
					dados [j + passo] = dados[j];
					j = j - passo;
				}
				dados [j + passo] = value;
			}
		}
		while(passo > 1);
	} 

}
