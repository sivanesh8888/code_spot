import java.util.*;
class Prime
{
int no,i=2;
boolean prime=true;
void calcPrime()
{
Scanner s=new Scanner(System.in);
System.out.println(" Enter the Number to check Prime or not =");
no=s.nextInt();
while(i<no)
{
if(no%i==0)
{
System.out.println("It is a Non-Prime number ");
prime=false;
break;
}
i=i+1;
}
if(prime==true)
{
System.out.println("It is a Prime number");
}
}
public static void main(String args[])
{
Prime p=new Prime();
p.calcPrime();
}
}
