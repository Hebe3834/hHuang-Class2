//SELECTION SORTING
import java.util.Arrays;
public class Selection{
  public static void main(String[]args){
    int[] arr = new int[]{20,7,15,5,3,7,1};
    selection(arr);
  }
  public static void selection(int arr[]){
    int min;
    for (int i=0; i<50; i++){
      for (int n=i; n<arr.length; n++){
        if (arr[n]<arr[i]){
          min=arr[n];
          arr[n]=arr[i];
          arr[i]=min;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
