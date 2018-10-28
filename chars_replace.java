
/*
C program to remove characters from the first string which are present in the second string. Two
string will be given as input from command line as first and second argument. You need to
remove characters from the first string which are present in the second string print it.
For ex : [./a.out morzilla mzi] =>orzlla
[./a.out morzilla123 la] =>morzi123

*/
class chars_replace{
public static void main(String args[]){
if(args.length>2 || args.length==0)
   System.out.println("ERROR");
else{
String a1=args[0];
String a2=args[1];
String a3="";
for(int i=0;i<a2.length();i++)
{
a1=a1.replace(a2.charAt(i)+"","");
}
System.out.println(a1);
}
}
}
