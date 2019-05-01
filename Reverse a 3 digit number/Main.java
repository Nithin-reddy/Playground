import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int n2=n1%100;
    int n3=n2%10;
    int n4=n2/10;
    int n5=n1/100;
    int n6=n3*100+n4*10+n5;
    System.out.println(n6);
  
  }
}