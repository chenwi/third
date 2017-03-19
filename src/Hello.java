import java.util.*;

public class Hello {
public static void main(String args[]){
	System.out.println("helloworld");
	St p=new St();
	p.stort();
	try{
		System.out.println("\n请输入你的年龄：");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		System.out.println(age);
	}catch(InputMismatchException e){
		System.out.println("你应该输入整数！");
	}
	
}
}

class St{
	Scanner input=new Scanner(System.in);
	int i,j,t;
	int arr[]=new int [10];
	public void stort(){
		for(i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		for(i=0;i<arr.length-1;i++)
			for(j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
				t=arr[i]; arr[i]=arr[j]; arr[j]=t;
				}
			}
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}






