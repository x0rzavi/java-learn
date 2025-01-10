class Duck {
  private int size;

  public Duck() {
    this(20); // default
  }

  public Duck(int duckSize) {
    super();
    System.out.println("Quack");
    size = duckSize;
    System.out.println("size is " + size);
  }
}

class UseADuck {
  public static void main(String[] args) {
    Duck a = new Duck(30);
    Duck b = new Duck();
  }
}
