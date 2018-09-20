package ordenacao.outros;

public class OddEvenSort {
	
	static final int MENOR = -1;
	static final int IGUAL =  0;
	static final int MAIOR =  1;
	
	public static int COMPARA(int a, int b) {
	   if (a > b)
	      return MAIOR;
	   else if (a < b)
	      return MENOR;
	   else
	      return IGUAL;
	}

	public static void ODD_EVEN_SORT(int[] A) {
		boolean ordenado = false;
		while (!ordenado) {
			ordenado = true;
			for (int x=0; x < A.length-1; x+=2)
				if (COMPARA(A[x],A[x+1]) == MAIOR) {
					int temp = A[x];
					A[x] = A[x+1];
					A[x+1] = temp;
					ordenado = false;
				}
			for (int x=1; x < A.length-1; x+=2)
				if (COMPARA(A[x],A[x+1]) == MAIOR) {
					int temp = A[x];
					A[x] = A[x+1];
					A[x+1] = temp;
					ordenado = false;
				}
		}
	}

	public static void main(String[] args) {
		int[] A = {1,5,6,9,3,2,4,8,7};
		ODD_EVEN_SORT(A);
		for (int i : A)
			System.out.print(i + " ");
		System.exit(0);
	}

}
