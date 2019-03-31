/*ARRAYS
java: public boolean to return true/false
      public void to print
      lowercase first word, uppercase second (findPrime)
      never capitalize variables
      when creating variable with multiple words, use underscore (_)
      arr.length = refers to row
      arr[0].length = refers to column
formula:  int[] arr = new int[10]
          > int[] can be string[], boolean[], etc
          > allocates 10 spaces: from index 0 to space

  To Insert Values in Arrays:
          > arr[3] = 15
          > stores "15" in space 3

  To insert 1 for indes 0, 2 for indes 1, etc
      int[] arr = new int[10];
      for(int i=0; i<arr.length; i++){
        arr[i] = i+1;
        System.out.println(arr[i]+",");
        System.out.println();
        >int[] arr = new int[]{13,4,2,7,5,9} also works when there's no
        pattern among the numbers: values are automatically given to respective array indexes

  2D Arrays:
      int[][] arr2 = new int [][]{
                    {13,3,5,7,1},
                    {7,17,23,14},
                    {12,-1,56,10},
                    {32,3,15,2}
                  };
      System.out.println(arr2[1][3]);
      >prints out 14 (aero- based indexing means second row, fourth column)

  */

public class Lesson{
  public static void main(String[]args){
    int[][] arr2 = new int [][]{
                  {13,3,5,7,1},
                  {7,17,23,14},
                  {12,-1,56,10},
                  {32,3,15,2}
    };
  System.out.println(arr2[1][3]);
  }
}
