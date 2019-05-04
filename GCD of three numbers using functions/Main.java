import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	  Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int r=gcd_of_2num(n1,n2);
      System.out.print(gcd_of_2num(n1,n3));
    }
  public static int gcd_of_2num(int num1,int num2)
  {
    int min;
    if(num1<num2)
    {
      min=num1;
    }
    else
    {
      min=num2;
    }
    while(min>=1)
    {
      if((num1%min==0)&&(num2%min==0))
      {
        return min;
      }
      --min;
    }
    return 0;// Type your code here
	}
}