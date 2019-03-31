public class hw{
  public static void main(String[]args){
    Question1();
    System.out.println("");
    Question2();
    System.out.println("");
    Question3(9,7,1);
    System.out.println("");
  }

//Given a defined variable of score in the beginning, print out a grade of F is the grade is between 1 to 60 (inclusive),
//D if its from 61 to 70 (inclusive), C if its from 71-80 (inclusive), B if its from 81-90 (inclusive), and A if its from 91-100 (inclusive).
  public static void Question1(){
    int Grade =17;
    if (Grade>=91){
      System.out.println("A");
        }
    else if (Grade>80) {
      System.out.println("B");
    }
    else if (Grade>70) {
      System.out.println("C");
    }
    else if (Grade>60) {
      System.out.println("D");
    }
    else if (Grade<=61) {
      System.out.println("F");
    }
  }
//Prints out all numbers that are either multiples of 3 or multiples of 4 until 99, but not both.
  public static void Question2(){
    boolean three;
    boolean four;
    for(int num=0; num<100; num+=1){
      if (num % 3 == 0){
        three=true;
      }
      else{
        three=false;
      }
      if (num % 4 == 0){
        four=true;
      }
      else{
        four=false;
      }
      if (three==true){
        if (four==false){
          System.out.println(num);
        }
      }
      if (four==true){
        if (three==false){
          System.out.println(num);
        }
      }
    }
  }

//Write a program that takes three integer command-line arguments a, b, and c and print the number of distinct values (1, 2, or 3) among a, b, and c.
  public static void Question3(int a, int b, int c){
    if (a==b){
      if (b==c){
        System.out.println("1");
      }
      else{
        System.out.println("2");
      }
    }
    else{
      if (b==c){
        System.out.println("2");
      }
      else{
        if (c==a){
          System.out.println("2");
        }
        else{
          System.out.println("3");
        }
      }
    }
 }


//Write code that takes a integer in base 10 and turns the number into binary and prints it out in the end.




//Write a program that takes five integer command-line arguments and prints the median (the third largest one).



}
