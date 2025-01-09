class Animal {
  private String name;

  public void setName(String animalName) {
    name = animalName;
  }

  public void eat() {
    System.out.println("Animal " + name + " eats");
  }

  public void roam() {
    System.out.println("Animal " + name + " roams");
  }

  public void makeNoise() {
    System.out.println("Animal " + name + " makes noise");
  }
}

class Vet {
  public void giveShot(Animal animal) {
    animal.makeNoise();
  }
}

class Dog extends Animal {
  public void eat() {
    System.out.println("Animal is Dog");
    super.eat();
  }

  public void roam() {
    System.out.println("Animal is Dog");
    super.roam();
  }

  public void dogMethod() {
    System.out.println("Dog specific method was called");
  }
}

class Cat extends Animal {
  public void eat() {
    System.out.println("Animal is Cat");
    super.eat();
  }

  public void roam() {
    System.out.println("Animal is Cat");
    super.roam();
  }
}

class Wolf extends Animal {
  public void eat() {
    System.out.println("Animal is Wolf");
    super.eat();
  }

  public void roam() {
    System.out.println("Animal is Wolf");
    super.roam();
  }
}

class PolymorphismTest {
  public static void main(String[] args) {
    Animal[] animals = new Animal[3];
    animals[0] = new Dog();
    animals[0].setName("Tuffy");
    animals[0].dogMethod(); // error: cannot find symbol

    animals[1] = new Cat();
    animals[1].setName("Billu");

    animals[2] = new Wolf();
    animals[2].setName("Sheru");

    for (Animal animal : animals) {
      animal.eat();
      animal.roam();
    }

    Vet vet = new Vet();
    vet.giveShot(animals[0]);
    vet.giveShot(animals[1]);
    vet.giveShot(animals[2]);
  }
}
