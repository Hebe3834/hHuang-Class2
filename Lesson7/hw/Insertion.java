//INSERTION SORTING
import java.util.Arrays;
public class Insertion{
  public static void main(String[]args){
    int[] arr = new int[]{20,6,15,6,3,7,1};
    insertion(arr);
  }
  public static void insertion(int arr[]){
      for (int i = 1; i<arr.length; i++) {
         int current = arr[i];
         int n = i-1;
         while((n>=0) && (arr[n]>current)) {
             arr[n+1] = arr[n];
             n--;
         }
         // at this point we've exited, so n is either -1
         // or it's at the first element where current >= a[n]
         arr[n+1] = current;
      }
    System.out.println(Arrays.toString(arr));
  }
}
// O(n^2)
