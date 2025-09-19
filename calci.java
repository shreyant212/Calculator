import java.util.*;
public class calci
{
    int num,nm;
    calci(int n, int nn)
    {
        num=n;
        nm=nn;
    }
    int add()
{
    int s=0;
    s+=num+nm;
    return s;
}
int mul()
{
    int m=1;
    m=m*num*nm;
    return m;
}
int div()
{
    int r = num/nm;
    return r;
}
int sub()
{
    int su=0;
    su= num-nm;
    return su;
}
public static void main(String args[])
{
    Scanner sc= new Scanner (System.in);
    int num,nm;
    System.out.println("Enter 1st number");
    num=sc.nextInt();
    System.out.println("Enter 2nd number");
    nm=sc.nextInt();
    calci ob = new calci(num,nm);
    System.out.println("Enter arthematic operations");
    String choice= sc.next();
    
    if(choice.equals("+"))
    {
        int a = ob.add();
        System.out.println("Addition is ="+a);
        
    }
    else if (choice.equals("-"))
    {
        int b = ob.sub();
        System.out.println("Subtraction is ="+b);
        
    }
    else if (choice.equals("*"))
    {
        int c = ob.mul();
        System.out.println("Multiplication is ="+c);
        
    }
    else if (choice.equals("/"))
    {
        int d = ob.div();
        System.out.println("Division is ="+d);
        
    }
    else
    System.out.println("Enter valid operation");
}
}