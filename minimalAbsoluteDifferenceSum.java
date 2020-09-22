class Result {

    /*
     * Complete the 'minDiff' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minDiff(List<Integer> arr) {
        // Write your code here
        // Rearrange integers in array 
        // so that the sum of the abs diffs of all 
        // adj elements is minimized
        // Then compute the sum of the abs diffs

        // n = 5
        // [1, 3, 3, 2, 4]
        // -> [1, 2, 3, 3, 4]
        // |1 - 2| = 1, |2-3| = 1, |3-3|=0, |3-4| = 1
        // Sum of abs diffs = 1 + 1 + 0 + 1 = 3

        // Find out way to arrange the integers in the array
        // so that the abs diffs are minimized

        // First, solve problem: How to find minimum absolute difference?
        // 1. Sort array
        Collections.sort(arr);
        int sum = 0;

        // Loop through the array
        for(int i = 1; i < arr.size(); i++){
            // Get abs difference of each pair of elements
            int absDiff = arr.get(i) - arr.get(i-1);
            sum += absDiff;
        }

        return sum;


    }

}