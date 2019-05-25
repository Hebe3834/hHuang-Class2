BIG O NOTATION
  >time for code to run, relative to others
  > time stays same: runs in constant time
  > linear: O(n)
  > quadratic: O(n^2)
  > n is number of elements to loop thru/length of array

  // Constant time O(1)
  public int foo(int [] ary){
      return ary[0];
  }
  // Linear time O(n)
  public int foo2(int [] ary){
      int total = 0;
      for( int i : ary){
        total += i;
      }
      return total;
  }
  // quadratic time O(n^2)
  public int foo3(int [] ary){
      int total = 0;
      //outer loop runs N times.
      for( int i = 0; i < ary.length - 1; i++){
          //inner loop runs N times (on average)
          for( int j = 0 ; j < ary.length; j++){
            //Work Work Work
            total+=i+j+5;
          }
      }
      return total;
  }

  // quadratic time O(n^2)
  public int foo4(int [] ary){
      int total = 0;
      //outer loop runs N times.
      for( int i = 0; i < ary.length - 1; i++){
          //inner loop runs N times (on average)
          for( int j = i+1 ; j < ary.length; j++){
            //Work Work Work
            total+=i+j+5;
          }
      }
      return total;
  }
  // (n-1) + (n-2) + ... + 1
  // (n-1) * n / 2   = (n^2 - n )/ 2 <- O(n^2)

  /*
  These are all O(N)
  2N+5
  3N+200
  N + 10000

  Similarly:
  4N^2
  N^2 + 5N
  2N^2 + 10N + 20
  Are all considered to be just O(N^2)
  */

  // O(log(n))
  public static function1(int[]a){
    index = a.length() - 1;
    while(index > 0){
      System.out.println(a[index]);
      index = a.length/2;
    }
  }

  // 8 elemnts : runs 3
  // 16 elements : runs run 4 times
  // 32 elements : runs 5 times
