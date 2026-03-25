import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner q=new Scanner(System.in);
		char s[]=q.nextLine().toCharArray();
		int lt[]=new int[26];
		int rt[]=new int[26];
		int n=s.length;
		for(int i=0;i<n;i++)
		{
			int x=s[i]-'a';
			rt[x]++;
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int m=s[i];
			rt[s[i]-'a']--;
			for(int j=0;j<26;j++)
			{
				if(lt[j]>0 && rt[j]>0)
				{
					sum+=lt[j]*rt[j];
				}
			}
			lt[s[i]-'a']++;
		}
		System.out.print(sum);
	}
}
