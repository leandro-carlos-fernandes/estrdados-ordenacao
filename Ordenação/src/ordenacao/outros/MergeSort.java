package ordenacao.outros;
import java.util.Arrays;


public class MergeSort {
	
	public static void sort(int[] dados) {
        if (dados.length > 1) {
            int meio = dados.length/2;
            int[] subVetorEsq = Arrays.copyOfRange(dados, 0, meio);
            int[] subVetorDir = Arrays.copyOfRange(dados, meio, dados.length);
            sort(subVetorEsq);
            sort(subVetorDir);
            merge(dados, subVetorEsq, subVetorDir);
        }
    }

	public static void merge(int[] dados, int[] vetEsq, int[] vetDir) {
		int qtde = vetEsq.length + vetDir.length;

        int i,li,ri;
        i = li = ri = 0;
        
        while (i < qtde) {
            if ((li < vetEsq.length) && (ri<vetDir.length)) {
                if (vetEsq[li] < vetDir[ri]) {
                    dados[i] = vetEsq[li]; i++; li++;
                }
                else {
                    dados[i] = vetDir[ri]; i++; ri++;
                }
            }
            else {
                if (li >= vetEsq.length) {
                    while (ri < vetDir.length) {
                        dados[i] = vetDir[ri]; i++; ri++;
                    }
                }
                if (ri >= vetDir.length) {
                    while (li < vetEsq.length) {
                        dados[i] = vetEsq[li]; li++; i++;
                    }
                }
            }
        }
	}
	
}
