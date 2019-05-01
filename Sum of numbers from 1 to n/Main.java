import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i=0;
      for(i=0;n!=0;n--)
      {
        i=i+n;
      }
      System.out.println(i);
	}
}