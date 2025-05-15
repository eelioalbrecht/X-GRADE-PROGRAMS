// Java Program to find
// transpose of a matrix

class GFG {
	static final int N = 2;

	// This function stores transpose
	// of A[][] in B[][]
	static void transpose(int A[][], int B[][])
	{
		int i, j;
		for (i = 0; i < N; i++)
			for (j = 0; j < N; j++)
				B[i][j] = A[j][i];
	}

	// Driver code
	public static void main(String[] args)
	{
		int A[][] = { { 2, 5},
			      { 1, 3}};

		int B[][] = new int[N][N], i, j;

		// Function call
		transpose(A, B);

		System.out.print("Result matrix is \n");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++)
				System.out.print(B[i][j] + " ");
			System.out.print("\n");
		}
	}
}

// This code is contributed by Anant Agarwal.
