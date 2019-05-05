class Bird extends Animal{
  void move(){
    System.out.println("Fly");
  }
  void eat(){
    System.out.println("Worms");
  }
}

class Fish extends Bird{
  void move(){
    System.out.println("Swim");
  }
  void eat(){
    System.out.println("Seaweed");
  }
}
