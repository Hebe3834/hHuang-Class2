public class hw{
    public static void main(String[]args){

//Prints out all the even numbers from 50 to 100 (inclusive)
    for(int x=50; x<=100; x+=2){
      System.out.println(x);
    }
    System.out.println(" ");
    int y=48;
    while (y<100){
      y+=2;
      System.out.println(y);
    }
    System.out.println(" ");

//Sums the numbers from 1 to 10 and prints out the sum one time in the end.
    int t=0;
    for(int n=1; n<=10; n+=1){
      t+=n;
      if (t>50) {
        System.out.println(t);
      }
    }
    System.out.println(" ");
    int a=0;
    int v=0;
    while(v<10){
      v+=1;
      a+=v;
      if (a>50) {
        System.out.println(a);
      }
    }
    System.out.println(" ");

//Prints out the Fibonacci numbers from 0-9999
    int i=0;
    int ii=1;
    int iii=1;
    for(int f=0; f<9999; f=ii+iii){
      i=ii;
      ii=iii;
      iii=f;
      System.out.println(f);
    }
    System.out.println(" ");

    int b=0;
    int bb=1;
    int bbb=1;
    int w=0;
    System.out.println(b);
    System.out.println(bb);
    System.out.println(bbb);
    while(w<6666){
      w=bb+bbb;
      b=bb;
      bb=bbb;
      bbb=w;
      System.out.println(w);
    }
  }
}
