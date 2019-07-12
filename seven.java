import java.util.*;
public class seven
{
    public static void main(String args[])
    {
        int k=2;
        int j=1;
        int a,b;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(j<n)
        {
            j=j*k;
        }
        a=j-n;
        j=j/2;
        b=n-j;
        if(a<b)
        {
            System.out.print(a);
        }
        else
        {
            System.out.print(b);
        }
    }
}
