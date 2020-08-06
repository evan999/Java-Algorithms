class Result {

    /*
     * Complete the 'priceCheck' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY products
     *  2. FLOAT_ARRAY productPrices
     *  3. STRING_ARRAY productSold
     *  4. FLOAT_ARRAY soldPrice
     */
 // Write your code here
        // Return the number of selling errors 
        // Compare the products list with productSold list
        // Count the selling errors
        
        // Need a way to compare the products list with productSold list
        // Two hashmaps to store each list's products and prices:
        // productList - stores the products and prices (float) 
        // sold - stores the sold products and prices 
    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
           int sellingErrors = 0;

        HashMap<String, Float> productList = new HashMap<String, Float>();
        HashMap<String, Float> sold = new HashMap<String, Float>();

        // Populate the productList HashMap using a forloop 
        for(int i = 0; i < products.size(); i++){
            productList.put(products.get(i), productPrices.get(i));
        }

        //Populating the sold List
        for(int i = 0; i < productSold.size(); i++){
            sold.put(productSold.get(i), soldPrice.get(i));
            
        }
        for(Map.Entry sale : sold.entrySet()){
            // if(!productList.containsKey(sale.getKey())){
            //     sellingErrors++;
            // }
            if(productList.containsKey(sale.getKey())){
                if(!productList.containsValue(sale.getValue()));
                    sellingErrors++;
            }
        }
        /*
            for (Map.Entry me : hmap.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }*/
        // for(Map.Entry purchase : productList.entrySet())
        //     System.out.println(purchase);
        System.out.println(productList);
        System.out.println(sold);


        return sellingErrors;
    }

}
