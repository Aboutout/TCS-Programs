class spiral
{
public static void main(String args[])
{
int r = 0,m=3;
int n = 6,c=0;
        int arr[][] = { {1,  2,  3,  4,  5,  6},
                      {7,  8,  9,  10, 11, 12},
                      {13, 14, 15, 16, 17, 18}
                    };

while(r<m && c<n)
{
for(int i=c;i<n;i++)
{
System.out.println(arr[r][i]);
}
r++;

for(int j=r;j<m;j++)
{
System.out.println(arr[j][n-1]);
}
n--;

if(r<m)
{
for(int k=n-1;k>=c;k--)
{
System.out.println(arr[m-1][k]);
} 
m--;
}
if(c<n)
{
for(int l=m-1;l>=r;l--)
{
System.out.println(arr[l][c]);
}
c++;
}

}

}
}
