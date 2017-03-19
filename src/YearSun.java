import java.io.BufferedReader;
import java.io.FileReader;

class TimeSun{
	double[] arg1=new double[153300];
	double[] arg2=new double[153300];
	double[][] DArr1=new double[400][450];
	double[][] DArr2=new double[400][450];
	public void RFILE_1(){
		try {
	        System.out.println(System.in);
	        FileReader fileReader1 = new FileReader("C:/�߶Ƚ�1.txt");
	        BufferedReader buf = new BufferedReader(fileReader1);
	        int i = 0;
	        String bufToString = "";
	        String readLine = "";
	        String[] myArray = new String[154000];  
	        
	        while((readLine = buf.readLine()) != null){
	            myArray[i] = readLine;
	            i++;   
	        }
	        for( i=0;i<153300;i++){
	        	this.arg1[i]=Double.valueOf(myArray[i]);	     
	        }	        
	   }catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void RFILE_2(){
		try {
	        System.out.println(System.in);
	        FileReader fileReader1 = new FileReader("C:/��λ��1.txt");
	        BufferedReader buf = new BufferedReader(fileReader1);
	        int i = 0;
	        String bufToString = "";
	        String readLine = "";
	        String[] myArray1 = new String[154000];  
	        
	        while((readLine = buf.readLine()) != null){
	            myArray1[i] = readLine;
	            i++;   
	        }
	        for( i=0;i<153300;i++){
	        	this.arg2[i]=Double.valueOf(myArray1[i]);
	        	//System.out.println(this.arg2[i]);
	        }	        
	   }catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void Light(){
		double x14=3784252.440,y14=517000.794;//14��������
		double x8=3784159.059,y8=516993.956;//8��������
		double a1401=Math.atan((y14-y8+16.2)/(4.3+74.78));//��λ��
		double b1401=Math.atan((y14-y8-3.7)/(4.3+74.78));//��λ��

		double x7=3784178.895,y7=516935.202;//7��������
		double a1402=Math.atan((y14-y7+16.2)/(4.3+54.13));//��λ��
		double b1402=Math.atan((y14-y7-3.7)/(4.3+54.13));//��λ��
					
			double L1=74.78,H=98.6;
			
			//¥��߶�����
			double H1=8*2.9;			
			double tana=L1/(H-H1);int co=0;
			double a=Math.atan(tana);//¥������
			for(int z=0;z<365;z++){
				int time=0;	
				
				for(int i=0;i<420;i+=5)
				{	int HH=9+i/60,MM=(i-(i/60)*60);
					
				if((DArr2[z][i]<0&&(Math.abs(DArr2[z][i]*Math.PI/180)>b1401))||
							(DArr2[z][i]>0&&(Math.abs(DArr2[z][i]*Math.PI/180)>a1401)&&
									(Math.abs(DArr2[z][i]*Math.PI/180)<b1402))||
							(DArr2[z][i]>0&&(Math.abs(DArr2[z][i]*Math.PI/180)>a1402)))
					{//û�н����ڵ�ʱ�Ĺ���ʱ��					//System.out.println("��"+HH+":"+MM+"ʱ�������⣬��¥��֮��");						
						time+=5;
					}
					else//��̫����λ���ڽ�����Χ��						
						if(DArr1[z][i]*Math.PI/180<a)
						{//̫���߶ȽǴ��ڸ�¥�������ǹ���ʱ��							
							time+=5;
						}
						else 
						{//û�й��յ�ʱ���//System.out.println("��"+HH+":"+MM+"ʱ�̹ⱻ�ڵ�*********");
						}							
				}			
				if(time>360){
					co++;
					System.out.println("��"+z+"��"+"����"+time+"�����й�");
				}						
				
			}
			System.out.println("����"+co+"���й�");	
	}
	
	public void DArray(){
		int i,j,m=0,n=0;
		for(i=0;i<365;i++)
			for(j=0;j<420;j++){			
				DArr1[i][j]=arg1[m++];
				DArr2[i][j]=arg2[n++];				
			}		
	}		
	}

public class YearSun{
	public static void main(String[] args){
		TimeSun Fa=new TimeSun();
		Fa.RFILE_1();
		Fa.RFILE_2();
		Fa.DArray();
		Fa.Light();		
	}
}
