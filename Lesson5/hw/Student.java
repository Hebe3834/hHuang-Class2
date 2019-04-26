public class Student{
  String name;
  String address;
  int numCourses;
  public Student(String n, String a, int c){
    name=n;
    address=a;
    numCourses=c;
  }
  public String getName(){
    return name;
  }
  public String getAddress(){
    return address;
  }
  public void setAddress(String newAddress){
    address=newAddress;
  }
  public String toString(){
    return name + " (" + address + ")";
  }
}
