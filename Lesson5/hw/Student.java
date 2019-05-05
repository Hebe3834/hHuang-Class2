public class Student{
  String name;
  String address;
  int numCourses;
  String[] Courses = new String[30];
  int[] Grades = new int[30];
  public Student(String n, String a, int numC){
    name=n;
    address=a;
    numCourses=numC;
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
  public void addCourseGrade(String course, int grade){
    Courses[numCourses] = course;
    Grades[numCourses] = grade;
    numCourses++;
  }
  public void printGrades(){
    System.out.println(name + " ");
    for (int i=0; i<numCourses; i++){
      System.out.print(Courses[i] + ": " + String.valueOf(Grades[i]) + ", ");
    }
    System.out.println("");
  }
  public double getAverageGrade(){
    double total=0;
    for (int i=0; i<Grades.length; i+=1){
      total+=Grades[i];
    }
    return total/numCourses;
  }
}
