import java.util.*;
class Duplicates 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try{
String str=sc.next();
char[] arr=str.toCharArray();
String target="";
for(char ch:arr)
{
if(target.indexOf(ch)==-1)
{
target+=ch;
}
}
System.out.println(target);
}
catch(Exception e)
{
System.out.println("ERROR");
}
}

}
