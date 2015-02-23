import java.io.*;
import java.util.*;
class age
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter your age");
a=sc.nextInt();
if(a>=18)
System.out.println("you are eligible to vote");
else
System.out.println("you're ineligible to vote");
}
}