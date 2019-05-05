/*
ABSTRACTION
  - abstract classes can't be instantiated
  - you need to instantiate one of its child classes
  - if you need to create a new object
      - can have both abstract and concrete methods
      - defined with abstrace keyword
*/
abstract class Animal{
  abstract void move();
  abstract void eat();
  void label(){
    System.out.println("I'm an aminal");
  }
}

//moce() and eat() are abstract methods
//label() is concrete
//move() and eat() defined in AnimalExample
