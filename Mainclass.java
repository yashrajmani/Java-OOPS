public class Mainclass {

  public static void main(String[] args) {
    // Person p1 = new Person();
    // p1.age = 20;
    // p1.name = "YASH";
    //USE THIS :
    Person p1 = new Person(20, "YASH");

    Person p2 = new Person();
    p2.age = 18;
    p2.name = "RAJ";

    System.out.println(p1.age + " " + p1.name);
    System.out.println(p2.age + " " + p2.name);

    p1.walk();
    p2.eat();

    p2.walk(2);

    System.out.println("COUNT : " + Person.count);
  }
}

//CLASS
class Person {

  String name;
  int age;

  //can be accessed by class not obj - static
  static int count = 0;

  //default constructor
  public Person() {
    System.out.println("CREATING OBJECT");
    count++;
  }

  //user defined constructor : Overloading default constructor
  //   public Person(int NewAge, String NewName) {
  //     age = NewAge;
  //     name = NewName;
  //   }
  //use of this keyowrd
  public Person(int age, String name) {
    this(); //call  the default constructor also
    this.age = age;
    this.name = name; //same name variable arg
  }

  void walk() {
    System.out.println(name + " is walking");
  }

  void eat() {
    System.out.println(name + " is eating");
  }

  void walk(int steps) {
    System.out.println(name + " walked " + steps);
  }
}
