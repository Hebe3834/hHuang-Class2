/*
(I)
class Test{
  public static void main(String[]args){
    Bird b=new Bird();
    b.fly();
    b.fly(10000);
    b.fly("Parrot", 100);
  }
}
*/

class Test{
  public static void main(String[]args){
    Animal a=new Bird();
    a.eat();
    Bird b=new Bird();
    b.eat();
  }
}
//bird=>animal, animal =/>bird
