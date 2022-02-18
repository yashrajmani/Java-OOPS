public class abstraction {

  public static void main(String[] args) {
    // NO USE IN REAL LIFE , no brand- nothing
    // Car c1 = new Car();
    // c1.price = 10000;
    // c1.start();

    //use children not parent(abstract)
    Audi a = new Audi();
    a.start();
    a.breaks();

    BMW b = new BMW();
    b.start();
    b.breaks();
  }
}

class Audi extends Car {

  //abstract method needs to be implemented
  @Override
  void start() {
    System.out.println("AUDI IS STARTING");
  }
}

class BMW extends Car {

  //abstract method needs to be implemented
  @Override
  void start() {
    System.out.println("BMW IS STARTING");
  }
}

// CAR is a concept , no objects needed or desired to be created : abstract
abstract class Car {

  int price;

  abstract void start(); //no need to define a useless abstract method

  //method abstract then complusion : class abstract


  //free method is also allowed
  void breaks() {
    System.out.println("BREAK IS APPLIED");
  }
}
