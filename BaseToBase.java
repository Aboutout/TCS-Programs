/*
C program to convert a number belonging to one base into its corresponding equivalent
belonging to any other base. For e.g. binary number (Base 2) to Decimal (Base 10)
*/
import java.util.*;
class BaseToBase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try{
int number=sc.nextInt();
int fromBase=sc.nextInt();
int toBase=sc.nextInt();
System.out.println(Integer.toString(Integer.parseInt(Integer.toString(number), fromBase), toBase));
}
catch(Exception e)
{
System.out.println("ERROR");
}
}

}
