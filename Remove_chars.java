import java.util.*;
class Remove_chars
{
public static boolean isPalindrome(String s)
{
String s1="";
for(int j=s.length()-1;j>=0;j--)
{
s1+=s.charAt(j)+"";
//System.out.println(s1);
}

if(s.equalsIgnoreCase(s1))
 return true;
else
return false;
}
public static void main(String[] args)
{
try{
String str=args[0];
String target="";
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(Character.isWhitespace(ch))
target+=ch+"";
else if(Character.isLetter(ch))
{
target+=ch+"";
}
}
System.out.println(target);
System.out.println(target.toUpperCase());
if(Remove_chars.isPalindrome(str))
System.out.println("YES");
else
System.out.println("NO");
}
catch(Exception e)
{
System.out.println("ERROR");
}
}
}
