import java.util.Scanner;
class Main
{
  public static int sq(int m)
  {
    int i=m*m;
    return i;
  }
	public static void main (String[] args)
    {
	Scanner s =new Scanner(System.in);
      int n=s.nextInt();
      int b=sq(n);
      n=b;
      System.out.println(n);
	} 
}