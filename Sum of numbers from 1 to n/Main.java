import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      for(int m=1;m<=n;m=m+1)
      {
        sum=sum+m;
      }
      System.out.println(sum);
    // Type your code here
	}
}