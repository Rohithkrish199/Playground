import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	     // Type your code here
           Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int num ;
      

      for(num =1; num<=n*2; num = num +1)
      {
        if(num%2==1)
          {
        System.out.println(num);
          }
      }
	}
}