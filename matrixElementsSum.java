int matrixElementsSum(int[][] matrix) {
    int totalCost = 0;

   // int[][] matrix = new int[5][5];

    //int[] hauntedColumns = new int[matrix[0].length];

    for(int row = 0; row < matrix.length; row++)
    {
        for(int column = 0; column < matrix[0].length; column++)
        {
            if(matrix[row][column] == 0)
            {
                //System.out.print("H, ");
                //hauntedColumns[row] += matrix[0][column];
                System.out.println("H column: " + matrix[0][column]);
                continue;
            }

            //System.out.print(matrix[row][column] + ", ");
            totalCost += matrix[row][column];
            
        }

        //System.out.println();
    }

    //System.out.println(totalCost);
    return totalCost;
}