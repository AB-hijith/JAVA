import java.util.Scanner;
class Pattern
{
 public static void main(String[] args)
 {
  int i,j,n;
  Scanner myObj= new Scanner(System.in);
  System.out.println("Enter Limit:");
  n= myObj.nextInt();
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=i;j++)
   { 
    System.out.print(i+"");
   }
   System.out.println(" ");
  }
 }
}
