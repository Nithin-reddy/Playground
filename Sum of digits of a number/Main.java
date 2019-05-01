import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m;
      int rem=0;
      while(n>10)
      {
        m=n%10;
        n=n/10;
        rem=rem+m;
      }
	
      int sum=rem+n;
      System.out.println(sum);
    }
      
}