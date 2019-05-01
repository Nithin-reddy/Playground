import java.util.Scanner;
class Main{
  public static int sum(int m)
  {
    int sum=0;
    while(m!=0)
    {
      sum=sum+m;
      m--;
    }
    sum=sum+m;
    return sum;
  }
	public static void main (String[] args){
	Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int b=sum(n);
      n=b;
      System.out.println(n);
	}
}