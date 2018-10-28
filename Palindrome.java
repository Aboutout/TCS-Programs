class Palindrome
{
public static void main(String args[])
{
int number=Integer.parseInt(args[0]);
int rev=number,sum=0;

while(rev!=0)
{
int rem=rev%10;
sum=sum*10+rem;
rev/=10;
}
if(sum==number)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
