import java.util.Scanner;
class LongestPalindromicSubstring{
	 public static void main(String[] arg){
		Scanner ip=new Scanner (System.in);
		System.out.println("Enter String");
		String s=ip.next();
		int a=s.length();
		int b=a;
		int c=0;
		while(b!=0){
			c=c+b;
			b=b-1;
		}
		String s3[]=new String[c];
		int n=0;
		for(int i=0;i<=a;i++)
		{
			for(int j=i;j<=a-1;j++)
			{
				s3[n]=s.substring(i,j+1);			
				n=n+1;
			}
		}
		int max=0,f=0;
		int ij=0;
		for(int i=0;i<c;i++){
			max=check(s3[i],max);
			if(max>f)
			{
				ij=i;
				f=max;
			}
		}
		System.out.println("Maximum size of Longest Palindromic Substring is = "+max);
		System.out.println("substring = "+s3[ij]);
	}
	static int check(String s,int m){
			String s1="";
			String s2="";
			int max=m;
			for(int j=s.length()-1;j>=0;j--){
				s1=s1+s.charAt(j);
			}
			if(s1.equals(s)){
				if(max<s1.length()){
					max=s1.length();
					s2=s1;
				}
			}
			return max;
		}
}