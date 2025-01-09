abstract class Animal { // abstract class
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

  abstract public void sleep(); // abstract method
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

  public void sleep() {
    System.out.println("Dog sleeps");
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

  public void sleep() {
    System.out.println("Cat sleeps");
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

  public void sleep() {
    System.out.println("Wolf sleeps");
  }
}

class PolymorphismTest {
  public static void main(String[] args) {
    Animal[] animals = new Animal[4];
    animals[0] = new Dog();
    animals[0].setName("Tuffy");

    animals[1] = new Cat();
    animals[1].setName("Billu");

    animals[2] = new Wolf();
    animals[2].setName("Sheru");

    animals[3] = new Animal(); // error

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
