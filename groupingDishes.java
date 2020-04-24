String[][] groupingDishes(String[][] dishes) {

	ArrayList<String> ingredients = new ArrayList<String>();

	//HashMap<String, Integer> map = new HashMap<String, Integer>();
 // int counter = 0;

	for (int i = 0; i < dishes.length; i++){
			for(int j = 0; j < dishes[i].length; j++){
					ingredients.add(dishes[i][j]);
					//map.put(dishes[i][j], counter++);
					/*
					if(map.containsKey(dishes[i][j])) {
						 //Integer count = map.get(dishes[i][j]);
						 //map.put(dishes[i][j], count + 1);
						 //map.put(dishes[i][j], map.get(dishes[i][j]) + 1);
						 //System.out.println(count);
					}
					*/
					 // map.get(counter++;
			}
	}

	Collections.sort(ingredients);

	 HashMap<String, Integer> map = new HashMap<String, Integer>();

	for(String ingredient: ingredients) {
			if(map.containsKey(ingredient)){
					map.put(ingredient, map.get(ingredient) +1);
			}
			else {
					map.put(ingredient, 1);
			}

			System.out.println(ingredient);
	}

	for(Object i : map) {

	}

	return dishes;
}