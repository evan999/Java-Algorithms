class Solution {
    public boolean checkPerfectNumber(int num) {
        
        if(num < 2){
            return false;
        }
        
        int sum = 1;
        
        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0){
                sum = sum + i + (num/i);
            }
        }
        
        return sum == num;
    }
}