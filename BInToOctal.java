import java.util.*;
class BinToOctal
{

public static void check(int num)
{
while(num>0)
{
int temp=num%10;
if(temp > 1 || temp<0)
   throw Exception();
}
}
public static void main(String args[])
{
try{
Scanner sc=new Scanner(System.in);
int b=sc.next();
BinToOctal.check(b);
}
catch(Exception e)
{
System.out.println("ERROR");
}
}
}
