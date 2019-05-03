public class example{
  public static void main(String[]args){
    Question1();
    System.out.println("");
    Question2();
  }
  public static void Question1(){
    Author Author1=new Author("Claire", "claire@gmail.com", 'f');
    System.out.println(Author1.getName());
    System.out.println(Author1.getEmail());
    Author1.setEmail("claire@icloud.com");
    System.out.println("new email:" + Author1.getEmail());
    System.out.println(Author1.getGender());
    System.out.println(Author1);
  }
  public static void Question2(){
    Student Student1=new Student("John", "Campus St", 0);
    System.out.println(Student1.getName());
    System.out.println(Student1.getAddress());
    Student1.setAddress("Chambers St");
    System.out.println("new address:" + Student1.getAddress());
    System.out.println(Student1);
    Student1.addCourseGrade(1, "Calculus", 98);
    Student1.addCourseGrade(2, "Algebra 1", 65);
    Student1.printGrades();
    System.out.println(Student1.getAverageGrade());
  }
}
