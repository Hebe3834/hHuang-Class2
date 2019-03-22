  /*
  ctrl s to save here
  Blue dot ^ = not saved
  Java is case sensitive
  semicolon to end statement
  void - function won't return anything
  javac - "java compile" byte code
  cd to jump b/t folders

  <Data types>: primitive (int=integer, double=decimal)
                    object(String="hello", char=character, boolean=true/false)
                      int (type of variable) a (namr of variable) = 5 (value)

  <For Loop>: for(int i=0;i<10;i++){}
              (i=0)=declaration (i<10)=condition  (i++)=increment
              integer inccreases by 1 (i++) until 10
              i+=2 (i increases by 2)
  <While Loop>: int y=0 while y=10)

<EXAMPLES>
for(int i=0; i<10; i++){
  System.out.println("test");
}

int y=0;
while (y<=10) {
  y++;
  System.out.println("tests");
 }
*/
public class Lesson{
    public static void main(String[]args){
    System.out.println("Hi");

    for(int x=10; x<=20; x+=2){
      System.out.println(x);
    }

    int n=8;
    while (n<20){
      n+=2;
      System.out.println(n);
    }
  }
}
