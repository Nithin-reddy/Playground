import java.util.Scanner;
class Main{
  public static int sq(int a, int b)
  {
    int i=1;
    while(b!=0)
    {
      i=i*a;
      b--;
    }
    return i;
  }
	public static void main (String[] args){
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=s.nextInt();
      int d=sq(n,m);
      n=d;
      System.out.println(n);
      
	    
	}
}