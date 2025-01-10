class Duck {
  private int size;
  public Duck() {
    System.out.println("Quack");
    size = 20; // default
    System.out.println("size is " + size);
  }

  public Duck(int duckSize) {
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
