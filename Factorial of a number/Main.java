import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner s= new Scanner (System.in);
      int n=s.nextInt();
      int i;
      for(i=1;n!=0;n--)
      {
        i=i*n;
      }
      System.out.println(i);
	}
}