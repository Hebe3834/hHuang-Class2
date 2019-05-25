//BUBBLE SORTING
import java.util.Arrays;
public class Bubble{
  public static void main(String[]args){
    int[] arr = new int[]{20,6,15,6,3,7,1};
    bubbleSort(arr);
  }
  public static void bubbleSort(int arr[]){
    int[] tempArr = new int[arr.length];
    for (int n=0; n<arr.length-1; n++){
      tempArr[n]=arr[n];
    }
    for (int i=0; i<arr.length-1; i++){
      if (arr[i]>arr[i+1]){
        int tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tmp;
      }
    }
    for (int counter=0; counter<arr.length-1; counter++){
      if (tempArr[counter]!=arr[counter]){
        for (int i=0; i<arr.length-1; i++){
          if (arr[i]>arr[i+1]){
            int tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
          }
        }
      }
    }
  System.out.println(Arrays.toString(arr));
  }
}

//System.out.println(Arrays.toString(array));
