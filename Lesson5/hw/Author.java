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
  //can also write this.email=newEmail
  //this refers to this instance, newEmail is new getEmai
  //for a different author a2, use a2.email
  }
  public char getGender(){
    return gender;
  }
  public String toString(){
    return name + " (" + gender + ") " + "at " + email;
  }
}
