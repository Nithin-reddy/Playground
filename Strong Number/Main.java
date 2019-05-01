import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=n;
      int sum=0;
      int count;
      while(n>0)
      {
        int rem=n%10;
        for(count=1;rem!=0;rem--)
        {
          count=count*rem;
        }
        sum=sum+count;
        n=n/10;
      }
      if(sum==num)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
        
        
	}
}