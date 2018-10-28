import java.util.*;
class replaceString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
str+=sc.nextLine();
char ch1=sc.next().charAt(0);
char ch2=sc.next().charAt(0);
str=str.replace(ch1,ch2);
System.out.println(str);
}
}
