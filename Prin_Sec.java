import java.util.*;
class Pric_Sec
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int[][] arr=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=scan.nextInt();
}
}
int pric=0;
for(int i=0;i<n;i++)
{
pric+=arr[i][i];
}
int Sec=0;
int j=0,i=0;
for(i=0,j=n-1;i<n && j>=0;i++,j--)
{
Sec+=arr[i][j];
}
System.out.print(pric+"\n"+Sec);
}
}

