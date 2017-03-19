package test;

import java.util.*;
public class work{ 
	public static char a[]=new char[10];
	public static char b[]=new char[10];
	public static char a1[]=new char[10];
	public static char b1[]=new char[10];
	public static int F[][]=new int[10][10];
	public static int B[][]=new int[10][10];
	public void f(char a[],char b[],int x,int y){
		int max=0,i,j;
		F[0][0]=0;
		for(i=0;i<x;i++)
			{F[i][0]=-2*i;B[i][0]=3;}
		for(j=0;j<y;j++)
			{F[0][j]=-2*j;B[0][j]=2;}
		for(i=1;i<x;i++)
			for(j=1;j<y;j++)
			{
				int score=-2;
				if(a[i]!='0'&&b[j]!='0')
				{
					if(a[i]==b[j]) score=3;
					else score=-1;
				}
				int s1=F[i-1][j-1]+score;
				int s2=F[i][j-1]-2;//竖
				int s3=F[i-1][j]-2;//横
				if(s1>=s2&&s1>=s3) {max=s1;B[i][j]=1;}
				else if(s2>=s1&&s2>=s3) {max=s2;B[i][j]=2;}
				else if(s3>=s2&&s3>=s1) {max=s3;B[i][j]=3;}
				F[i][j]=max;
			}
	}
	public void print(int x,int y){
		for(int j=0;j<y;j++)
			for(int i=0;i<x;i++)
				{
				System.out.print("\t"+F[i][j]+" "); 
				if(i==x-1) System.out.println("");
				}
		System.out.println("");
		for(int i=0;i<x-1;i++) System.out.print(a1[i]+" ");
		System.out.println("");
		for(int i=0;i<y;i++) System.out.print(b1[i]+" ");
	}
	public void huishu(char a[],char b[],int x,int y){
		for(int i=x-1,j=y-1,i1=x-2,j1=y-1;i>=0&&j>=0&&i1>=0&&j1>=0;i1--,j1--)
			{if(B[i][j]==1) {a1[i1]=a[i];b1[j1]=b[j];i--;j--;}
			else if(B[i][j]==2) {a1[i1]='0';b1[j1]=b[j];j--;}
			else if(B[i][j]==3) {a1[i1]=a[i];b1[j1]='0';i--;}
		}
	}
	public static void main(String [] args) {
		work ex=new work();
		System.out.println("输入序列1(5bp):");  
		Scanner sscScanner1 = new Scanner(System.in);  
		String sstrString1 = sscScanner1.next();  
		char a[] = sstrString1.toCharArray();
		int an=a.length;
		System.out.println("输入序列2(5bp):");  
		Scanner sscScanner2 = new Scanner(System.in);  
		String sstrString2 = sscScanner2.next();  
		char b[] = sstrString2.toCharArray();
		int bn=b.length;
		ex.f(a,b,an,bn);
		ex.huishu(a,b,an,bn);
		ex.print(an,bn);
	}
}
