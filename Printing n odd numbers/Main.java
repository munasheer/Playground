import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      for(int m=1;m<=2*n;m=m+1)
      {
        if(m%2==1)
        {
          System.out.println(m);
        }
        m=m+1;
      }// Type your code here
	}
}