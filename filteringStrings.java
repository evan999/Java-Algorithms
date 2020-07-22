class Main {
  public static void main(String[] args) {
    String rawInput = "Bread$$##12.5$$##10";
    String newString = rawInput.replaceAll("\\$\\$##"," ");
		String[] arrOfStr = newString.split(" ");
		
    for(String item : arrOfStr)
      System.out.println(item);
  }
}