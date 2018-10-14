# PRIME-NUMBER
package oxygen.com;
import java.util.Scanner;  
public class Prime {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int num=s.nextInt();
int flag=0;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
	 flag=1;
	break;
}
}
if(flag==0)
{
	System.out.println("number is prime");
}
else
{
	System.out.println("number is not prime");
}
}
}
OUTPUT:
enter a number:
2
number is prime
