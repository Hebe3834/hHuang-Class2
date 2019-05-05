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
  public Student(String f, int g){
    grade=g;
    first=f;
    //instantiation function ^^
  }
  public int getGrade(){
    return grade;
  }
  public String toString(){
    return "Studentname:"+first;
  }
}
