import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
      int max;
      if(arr[0]>arr[1])
      {
        max=arr[0];
      }
      else{
        max=arr[1];
      }
      for(int i=2;i<=arr_size-1;i++)
      {
        if(max<arr[i])
        {
          max=arr[i];
        }
      }
      System.out.println(max);// Type your code here
    }
}