/*
2 types:
  - Static polyprophism
  - Dynamic polymorphism
//functions with same name but diff input types: OVERLOADING vv
  */

/*
class Bird{
  public void fly(){
    System.out.println("flying");
  }
  public void fly(int height){
    System.out.println("Flying at "+height);
  }
  public void fly(String name, int height){
    System.out.println(name+"flying at "+height);
  }
}*/

class Animal{
  public void eat(){
    System.out.println("I'm an animal");
  }
}
//Bird OVERRIDES animal v^
class Bird extends Animal{
  public void eat(){
    System.out.println("The bird eats seeds");
  }
}
