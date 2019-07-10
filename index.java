import java.util.*;
public class index
{
    public static void main(String args[])
    {
        int i;
        int t=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i==a[i])
            {
                t=1;
                System.out.print(a[i]);
            }
        }
        if(t==0)
        {
            System.out.println("-1");
        }
    }
}
