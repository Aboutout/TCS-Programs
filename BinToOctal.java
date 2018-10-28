import java.util.*;
class BinToOctal
{

public static void check(int num) throws Exception
{
while(num>0)
{
int temp=num%10;
if(temp > 1 || temp<0)
   throw new Exception();
num/=10;
}

}
public static void main(String args[])
{
try{
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
BinToOctal.check(b);

System.out.println(Integer.toString(Integer.parseInt(Integer.toString(b),2),8));
}
catch(Exception e)
{
System.out.println("ERROR");
}
}
}
