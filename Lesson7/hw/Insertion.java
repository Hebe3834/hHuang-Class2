//INSERTION SORTING
import java.util.Arrays;
public class Insertion{
  public static void main(String[]args){
    int[] arr = new int[]{20,6,15,6,3,7,1};
    insertion(arr);
  }
  public static void insertion(int arr[]){
      for (int i = 1; i<arr.length; i++) {
         int num = arr[i];
         int n = i-1;
         while((n>=0) && (arr[n]>num)) {
             arr[n+1] = arr[n];
             n--;
         }
         arr[n+1] = num;
      }
    System.out.println(Arrays.toString(arr));
  }
}
