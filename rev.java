import java.util.*;
class factorial
{
    public static void main(String[] args)
    {
        int n;
        int f=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int d=n;
        for(int i=1;i<=d;i++)
        {
            f=f*n;
            n--;
        }
        System.out.print(f);
    }
}
