import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int copy=n;
      int sum=0;
      while(n>0)
      {
        int r=n%10;
        int fact=1;
        for(int i=1;i<=r;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
      }
      if(copy==sum)
      {
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }// Type your code here
	}
}