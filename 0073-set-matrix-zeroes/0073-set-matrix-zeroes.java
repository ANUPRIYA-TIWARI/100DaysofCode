class Solution {
    public void setZeroes(int[][] matrix) {
        int temp[][]=new int[matrix.length][matrix[0].length];
		 for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                temp[i][j]=1;
            }
		 }
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix.length;k++){   //col
                         temp[k][j]=0;
                    }
                    for(int l=0;l<matrix[0].length;l++){   //row
                            temp[i][l]=0;    
                    }
                }
            }
        }
        
		 for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(temp[i][j]==0)
                matrix[i][j]=0;
            }
         }
    }
}