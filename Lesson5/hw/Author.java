public class Author{
  String name;
  String email;
  char gender;
  public Author(String n, String m, char g){
    name=n;
    email=m;
    gender=g;
  }
  public String getName(){
    return name;
  }
  public String getEmail(){
    return email;
  }
  public void setEmail(String newEmail){
    email=newEmail;
  }
  public char getGender(){
    return gender;
  }
  public String toString(){
    return name + " (" + gender + ") " + "at " + email;
  }
}
