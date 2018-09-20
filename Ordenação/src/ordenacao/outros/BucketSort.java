package ordenacao.outros;

public class BucketSort {

	public static void sort(int[] dados, int limInfDominio, int limSupDominio) {
		int tamanho = limSupDominio - limInfDominio;
		int[] freq = new int[tamanho + 1];
		
		for (int i = 0; i < dados.length; i++)
			freq[ dados[i] - limInfDominio ]++;
		
		int j = 0;
		for (int i = 0; i < freq.length; i++) {
			while( freq[i] != 0) {
				dados[j++] = i + limInfDominio;
				freq[i]--;
			}
		}
	}
	
}
