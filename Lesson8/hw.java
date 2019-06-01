public class hw{
  public static void main(String[]args){
    fibonacci(5);
    System.out.println(rFibonacci(1));
    System.out.println(isPalindrome(""));
    System.out.println(isPalindrome("r a ce c ar"));
    int[] arr = new int[]{4,20,5,1};
    System.out.println(quickSort(arr));
  }

//iterative FIBONACCI solution
  public static void fibonacci(int n){
    if(n==1){
      System.out.println(0);
    }
    else if (n==2){
      System.out.println(1);
    }
    else{
      int first = 0;
      int second = 1;
      int third = 0;
      for(int i=2; i<n; i++){
        third = first + second;
        first = second;
        second = third;
      }
      System.out.println(third);
    }
  }
//recursive FIBONACCI solution
  public static int rFibonacci(int n){
    if(n==1){
      return 0;
    }
    else if (n==2){
      return 1;
    }
    else{
      return rFibonacci(n-1)+rFibonacci(n-2);
    }
  }


//iterative PALINDROME solution
  public static boolean isPalindrome(String n){
    if (n.equals("")){
      return true;
    }
    boolean ans = false;
    int last=n.length()-1;
    for(int i=0; i<(n.length()-1)/2; i++){
      if(n.charAt(i)==n.charAt(last)){
        ans = true;
        last--;
      }
      else{
        ans = false;
      }
    }
    return ans;
  }
//recursive PALINDROME solution
  public static boolean rIsPalindrome(String n){
    if (n.equals("")){
      return true;
    }
    if (n.length()<3 && n.charAt(0)==n.charAt(n.length()-1)){
      return true;
    }
    else if (n.length()>2 && n.charAt(0)==n.charAt(n.length()-1)){
      return rIsPalindrome(n.substring(1, n.length()-1));
    }
    else{
      return false;
    }
  }


//Quick Sort
  public static int[] quickSort(int arr[]){
    .
  }
}
