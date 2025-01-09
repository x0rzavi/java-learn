class ObjectClassTestDrive {
  public static void main(String[] args) {
    Dog a = new Dog();
    Cat b = new Cat();

    if (a.equals(b)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    System.out.println(b.getClass());
    System.out.println(b.hashCode());
    System.out.println(b.toString());
  }
}
