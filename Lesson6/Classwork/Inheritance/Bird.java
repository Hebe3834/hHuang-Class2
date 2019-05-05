/* INHERITANCE
  - extends class to child classes
  - allows child class to
            - inherit fields
            - inherit methods
        of parent class
  - achieve code resubmit
*/

class Bird{
  public String reproduction = "egg";
  public String outerCovering = "feathers";
  public void flyUp(){
    System.out.println("Flying Up");
  }
  public void flyDown(){
    System.out.println("Flying Down");
  }
}

class Eagle extends Bird{
  public String name = "Eagle";
  public int lifespan = 15;
  public String outerCovering = "bald";
}
