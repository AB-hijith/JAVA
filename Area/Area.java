import java.util.Scanner;
class Area
{
 public static void main(String[] args)
 {
  Scanner myObj= new Scanner(System.in);
  System.out.println("Enter Length:");
  int l= myObj.nextInt();
  System.out.println("Enter Breadth:");
  int b= myObj.nextInt();
  int area=l*b;
  System.out.println("Area:"+area);
 }
}
  
