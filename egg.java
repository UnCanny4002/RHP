import java.util.*;
class first
{
    public static void main(String []args)
    {
        Scanner q=new Scanner(System.in);
        int n=q.nextInt();
        int d=q.nextInt();
        int dp=1;
        int x[]=new int[n+1];
        int y[]=new int[n+1];
        int z[]=new int[n+1];
        for(int i=1;i<n+1;i++) x[i]=q.nextInt();
        for(int i=1;i<n+1;i++) y[i]=q.nextInt();
        for(int i=1;i<n+1;i++)
        {
            int need=y[i];
            while(dp<i-d)
            dp++;
            while(dp<i && need>0)
            {
                int bu=Math.min(need,z[dp]);
                need=bu;
                z[dp]=bu;
                if(z[dp]==0)
                dp++;
            }
            z[i]=y[i]-need;
        }
        int a=0;
        for(int i=n-d+1;i<n;i++)
        {
            a+=z[i];
        }
        System.out.print(a);
    }
}
