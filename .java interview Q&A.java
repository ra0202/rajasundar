1.Write code in any programming language to print the following pyramid


Coding language java 

import java.util.*;
public class Main
{
public static void main(String[] args)
{
int i, j, n, count = 0, count1 = 0, k = 0;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();

for(i = 1; i <= n; ++i)
{
for(j = 1; j <= n-i; ++j)
{
System.out.print(” “);
++count;
}

while(k != 2*i-1)
{
if (count <= n-1)
{
System.out.print(i+k + ” “);
++count;
}
else
{
++count1;
System.out.print((i+k-2*count1) + ” “);
}
++k;
}
count1 = count = k = 0;

System.out.println();
}
}
}

2 .Write code to remove repeating characters in a given string

Code language  java

Char[] chars = str . to CharArray();
String Builder  sb =new 
String Builder();
 boolean repeatedChar;
 for (int i=0; i<chars.length; i++)
{
repeatedChar =false ;
  for( int j= i+1; j<chars .length; j++)
{
if(chars [i] == chars [j])
{
repeatedChar = true;
 break;
}
}
 if( !repeated Char)
{
 sb.append(chars[i]);
}
}
 

