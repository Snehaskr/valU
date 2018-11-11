package End;

import java.util.HashMap;

/**
 * Represents an analysis of a word within a review.
 */
class Analyze {
  HashMap<String, Integer> values = new HashMap<>();
  Analyze() { }

  /**
   * Will update HashMap to add a new word or update the current word value if the word has already
   * been entered into the map. This allows users to keep track of how many instances of a specific
   * word there are as the key will represent the word and the interger the number of times it is
   * present.
   * @param text a word to be added to the map or counted if it already exists
   */
  public void frequency(String text) {
    if (text.equals(null)) {
      throw new IllegalArgumentException("No text to analyze!");
    }
    else {
      text = text.toLowerCase();
      if (values.containsKey(text)) {
        Integer num = values.get(text);
        num += 1;
        values.replace(text, num);

      }
      else {
        values.put(text, 1);
      }
    }
  }

}
