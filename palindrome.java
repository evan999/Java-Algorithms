boolean checkPalindrome(String inputString) {
    String reversed = "";

    for(int character = inputString.length()-1; character >= 0; character--)
    {
        reversed += inputString.charAt(character);
    }

    return reversed.equals(inputString);
}