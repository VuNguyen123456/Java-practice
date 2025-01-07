public class Lab2{
    public static double[][] transposeCopy(double[][] matrix){
		double [][] tempArray = new double[matrix.length][matrix[0].length];
        for(int i =0; i< matrix.length; ++i){
			for(int j=0; j < matrix[i].length; ++j){
				tempArray[i][j] = matrix[j][i]; 
				
			}
		}
        return tempArray;
    }

    public static void transposeInPlace(double[][] matrix){
		double temp;
        for(int i =0; i< matrix.length; ++i){
			for(int j=0; j < matrix[i].length; ++j){
				temp = matrix[i][j];
				matrix[j][i] = matrix[i][j]; 
				matrix[i][j] = temp;
			}
		}
    }

    public static void printMatrix(double[][] matrix){
        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[i].length; j ++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        double[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // Task 1
        //double[][] result = transposeCopy(m);
        //printMatrix(result);

        //Task 2
        // transposeInPlace(m);
        // printMatrix(m);
    }
}
