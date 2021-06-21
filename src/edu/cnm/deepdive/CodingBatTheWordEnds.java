package edu.cnm.deepdive;

/*
Given a string and a non-empty word string, return a string made of each char just before and just
after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may be included twice if
it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */

public class CodingBatTheWordEnds {

  public static void main(String[] args) {
    System.out.printf("With the Strings %s and %s, the outcome will be "
        + wordEnds("abcXY123XYijk", "XY") + ".\n", "abcXY123XYijk", "XY");
    System.out.printf("With the Strings %s and %s, the outcome will be "
        + wordEnds("XY123XY", "XY") + ".\n", "XY123XY", "XY");
    System.out.printf("With the Strings %s and %s, the outcome will be "
        + wordEnds("XY1XY", "XY") + ".\n", "XY1XY", "XY");
  }

  public static String wordEnds(String str, String word) {

    String result = "";
    int wlen = word.length();
    int slen = str.length();

    for (int i = 0; i <= slen - wlen; i++) {
      if (i >= 1 && str.substring(i, i + wlen).equals(word)) {
        result += str.charAt(i - 1);
      }

      if (str.substring(i, i + wlen).equals(word) && i < (slen - wlen)) {
        result += str.charAt(i + wlen);
      }
    }

    return result;
  }

}
