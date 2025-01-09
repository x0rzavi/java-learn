import java.util.ArrayList;

public class Startup {
  //private int[] locationCells;
  private ArrayList<String> locationCells;
  private int numOfHits = 0;

  //public void setLocationCells(int[] locs) {
  public void setLocationCells(ArrayList<String> locs) {
    locationCells = locs;
  }

  //public String checkYourself(int guess) {
  public String checkYourself(String userInput) {
    String result = "miss";

    int index = locationCells.indexOf(userInput);

    if (index >= 0) {
      locationCells.remove(index);
      if (locationCells.isEmpty()) {
        result = "kill";
      } else {
        result = "hit";
      }
    }

    /*
    for (int cell : locationCells) { // accessing instance variable locationCells
      if (guess == cell) { // BUG: Ignore previously made guesses
        result = "hit";
        numOfHits++;
        break;
      }
    }

    if (numOfHits == locationCells.length) {
      result = "kill";
    }
    */

    System.out.println(result);
    return result;
  }
}
