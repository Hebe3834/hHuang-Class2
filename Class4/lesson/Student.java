/*
Object types: String
Primitive types: int, char, boolean, etc

OBJECTS
  > have functions ( str.substring() )
  > String str = new String()

instance - instantiation at a class
          - ex. Apple is a instance of the class/object Fruits



*/

public class Student{
  int grade;
  String first;
  public Student(){
    first = "Josh";
    //instantiation function ^^
    //gave student1 the first name Josh
  }
  public String getName(){
    return first;
  }
}
