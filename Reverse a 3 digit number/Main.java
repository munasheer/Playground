import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
         Scanner in = new Scanner(System.in);
    int n=in.nextInt();
  int f=n/100;
  int s=(n/10)%10;
  int t=n%10;
  int rev=(t*100+s*10+f);
  System.out.println(rev);//Type your code here
  }
}