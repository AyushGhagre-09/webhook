
import java.io.*;

class GFG {

	
	static void printMatrix(int M[][],
							int rowSize,
							int colSize)
	{
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	
	static int[][] add(int A[][], int B[][],
					int size)
	{
		int i, j;
		int C[][] = new int[size][size];

		for (i = 0; i < size; i++)
			for (j = 0; j < size; j++)
				C[i][j] = A[i][j] + B[i][j];

		return C;
	}

	// Driver code
	public static void main(String[] args)
	{
		int size = 4;

		int A[][] = { { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 },
					{ 3, 3, 3, 3 },
					{ 4, 4, 4, 4 } };
		
		System.out.print("\nMatrix A:");
		System.out.println();
		printMatrix(A, size, size);

		int B[][] = { { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 },
					{ 3, 3, 3, 3 },
					{ 4, 4, 4, 4 } };
		
		System.out.println("\nMatrix B:");
		printMatrix(B, size, size);

		// Add the two matrices
		int C[][] = add(A, B, size);

		// Print the result
		System.out.println("\nResultant Matrix:");
		printMatrix(C, size, size);
	}
}

