package End;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

/**
 * Represents an execution of the program to create a .csv file with an entries of every adjective
 * used in each company review.
 */
public class Execute {

  /**
   * Will convert a JSON of words to a file containing syntax analysis of each word found in a
   * review and will count output to a .csv file how often those words appear in each excerpt of
   * text.
   * @param args the input JSON that represents a Google's Natural Lanugage Processing syntax
   *             analysis of individual words. Must be named with the convention:
   *             COMPANYNAMEReviews.json
   * @throws Exception is thrown when the program cannot read or write a file
   */
  public static void main(String[] args) throws Exception{
    //Will analyze JSONs created by the Google Natural Language Processing
    //Will search for which words are adjectives and then will call to keep count of the frequency
    //that these adjectives appear in reviews
    Analyze freqcounter = new Analyze();
    //takes in files of the name COMPANYNAMEReviews.json
    String name = args[0].substring(0, args[0].indexOf("Reviews.json"));
    try {
      Object file = new JSONParser().parse(new FileReader(args[0]));
      JSONObject options = (JSONObject) file;
      Object tokens = options.get("tokens");
      JSONArray list = (JSONArray) tokens;
      for (Object o : list) {
        JSONObject attribute = (JSONObject) o;
        Object attribute2 = attribute.get("partOfSpeech");
        Object text = attribute.get("text");
        String content = ((JSONObject) text).get("content").toString();
        Object tag = ((JSONObject) attribute2).get("tag");
        if (tag.toString().equals("ADJ")) {
          freqcounter.frequency(content);
        }
      }
    }
    catch (IOException e) {
      System.out.print(e.getMessage());
    }
    //writes the adjectives found and the number of times they were found to a .csv file
    String header = "company,word,frequency";
    try {
      //creates a file and will continually update the file with each company that is input
      File file = new File("reviews.csv");
      FileWriter write = new FileWriter(file, true);
      BufferedWriter br = new BufferedWriter(write);
      br.write(header + "\n");
      freqcounter.values.forEach((k, v) ->
      {
        try {
          br.write(name + "," + k + "," + Integer.toString(v) + "\n");
        } catch (IOException e) {
          throw new IllegalStateException("Can't write to file.");
        }
      });
      br.close();
      write.close();
    }
    catch (Exception e) {
      throw new IllegalStateException("Can't write ;(");
    }
  }
}
