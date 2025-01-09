class Animal {
  String name;

  void makeSound() {
    System.out.println("Animal " + name + " makes sound");
  }
}

class Canine extends Animal {
  void makeSound() {
    super.makeSound();
    System.out.println("This was called from Canine object");
  }
}

class InheritanceTestDrive {
  public static void main(String[] args) {
    Animal genericAnimal = new Animal();
    genericAnimal.name = "Generic Animal";
    genericAnimal.makeSound();

    Canine genericCanine = new Canine();
    genericCanine.name = "Generic Canine";
    genericCanine.makeSound();
  }
}
