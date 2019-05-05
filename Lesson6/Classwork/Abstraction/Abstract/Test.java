class Test {
  public static void main(String[]args){
    Bird b1 = new Bird();
    b1.eat();
    b1.move();
    b1.label();
    Fish f1 = new Fish();
    f1.eat();
    f1.move();
    f1.label();
  }
}
// Animal a1 = new Animal();  wouldn't work because
// you can instantiate the abstract class Animal()
