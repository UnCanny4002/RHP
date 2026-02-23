import java.util.*;
class first
{
    public static void main(String []args)
    {
        Scanner q=new Scanner(System.in);
        String v=q.nextLine();
        char s[]=v.toCharArray();
        int f=0;
        for(char c:s)
        {
            f=f^(1<<(c-'a'));
        }
        if((f==0) || (f&(f-1))==0)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
