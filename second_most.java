import java.util.*;
class second_most
{

public static void main(String args[])
{
int index=0;
Scanner sc=new Scanner(System.in);
String str=sc.next();
int count[]=new int[str.length()];
char[] char1=new char[str.length()];
int var=1;
for(int i=0;i<str.length();i++)
{
char ch1=str.charAt(i);
for(int j=0;j<str.length();j++)
{
if(j!=i)
{
char ch2=str.charAt(j);
if(ch2==ch1)
{
var++;
}
}
}
char1[index]=ch1;
count[index]=var;
index++;
var=1;
str=str.replace(ch1+"","");
}

for(int i=0;i<index;i++)
{
for(int j=0;j<index;j++)
{
if(count[i]>count[j])
{
int temp=count[i];
count[i]=count[j];
count[j]=temp;

char r=char1[i];
char1[i]=char1[j];
char1[j]=r;
}
}
}

System.out.println(char1[1]);
}
}
