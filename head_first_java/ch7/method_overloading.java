public class Overloads {
  String uniqueID;

  public int addNums (int a, int b) {
    return a + b;
  }

  public double addNums (double a, double b) {
    return a + b;
  }

  public void setUniqueID (String newID) {
    uniqueID = newID;
  }

  public void setUniqueID (int ssNumber) { // take note!
    String numString = "" + ssNumber;
    setUniqueID(numString);
  }
}
