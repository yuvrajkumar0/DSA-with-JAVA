public class SetMatrixZeroes { 
    public static void setZeroes(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    for(int k = 0; k<m; k++){
                        if(matrix[i][k] !=0){
                            matrix[i][k]=-1;
                        }
                    }
                    for(int k=0; k<n; k++){
                        if(matrix[k][j] !=0){
                            matrix[k][j]=-1;
                        }
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,1,1,1},
            {1,0,0,1},
            {1,1,0,1},
            {1,1,1,1},
        };
        setZeroes(matrix);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
