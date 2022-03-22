import java.util.Scanner;
class AddMatrix
{
 public static void main(String args[])
 {
  int r,c,i,j;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter number of rows");
  r= in.nextInt();
  System.out.println("Enter number columns");
  c= in.nextInt();
  int m1[][] = new int[r][c];
  int m2[][] = new int[r][c];
  int s1[][] = new int[r][c];
  System.out.println("Enter elements of 1st matrix");
  for(i=0;i<r;i++)
  { 
   for(j=0;j<c;j++)
   {
    m1[i][j] = in.nextInt();
   }
   System.out.println();
  }
  System.out.println("Enter elements of 2nd matrix");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    m2[i][j] = in.nextInt();
   }
  System.out.println();
  }
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    s1[i][j]=m1[i][j]+m2[i][j];
   }
  }  
  System.out.println("Sum");
  for(i=0;i<r;i++)
  { 
   for(j=0;j<c;j++)
   {
    System.out.print(s1[i][j]+"\t");
   }
  System.out.println();
  }
 }
}
