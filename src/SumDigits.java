public class SumDigits {
  /*

Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
characters.
Return 0 if there are no digits in the string.
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)
   */

  public static void main(String[] args) {
      SumDigits newSumDigits = new SumDigits();
      String str = "aa11b33";

    System.out.printf("\nThe sum of the digits in the String %s is " + newSumDigits.sumDigits(str)
        + ".\n", str);
  }

  public int sumDigits(String str) {
    int result = 0;

    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        String temp = str.substring(i, i + 1);
        result += Integer.parseInt(temp);
      }
    }
    return result;
  }

}
