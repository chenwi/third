import java.io.BufferedReader;
import java.io.FileReader;

class SunTime{
	double[] arg1=new double[500];
	double[] arg2=new double[500];
	public void RFILE_1(){
		try {
	        System.out.println(System.in);
	        FileReader fileReader1 = new FileReader("C:/�߶Ƚ�.txt");
	        BufferedReader buf = new BufferedReader(fileReader1);
	        int i = 0;
	        String bufToString = "";
	        String readLine = "";
	        String[] myArray = new String[500];  
	        
	        while((readLine = buf.readLine()) != null){
	            myArray[i] = readLine;
	            i++;   
	        }
	        for( i=0;i<420;i++){
	        	this.arg1[i]=Double.valueOf(myArray[i]);
	        	//System.out.println(this.arg1[i]);
	        }	        
	   }catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void RFILE_2(){
		try {
	        System.out.println(System.in);
	        FileReader fileReader1 = new FileReader("C:/��λ��.txt");
	        BufferedReader buf = new BufferedReader(fileReader1);
	        int i = 0;
	        String bufToString = "";
	        String readLine = "";
	        String[] myArray1 = new String[500];  
	        
	        while((readLine = buf.readLine()) != null){
	            myArray1[i] = readLine;
	            i++;   
	        }
	        for( i=0;i<420;i++){
	        	this.arg2[i]=Double.valueOf(myArray1[i]);
	        	//System.out.println(this.arg2[i]);
	        }	        
	   }catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void Light1(){
		double x14=3784252.440,y14=517000.794;//14��������
		double x8=3784159.059,y8=516993.956;//8��������
		double a1401=Math.atan((y14-y8+16.2)/(4.3+74.78));//��λ��
		double b1401=Math.atan((y14-y8-3.7)/(4.3+74.78));//��λ��

		double x7=3784178.895,y7=516935.202;//7��������
		double a1402=Math.atan((y14-y7+16.2)/(4.3+54.13));//��λ��
		double b1402=Math.atan((y14-y7-3.7)/(4.3+54.13));//��λ��
		
			int time=0;
			double L1=74.78,H=98.6;
			//¥��߶�����
			double H1=8*2.9;
			
			double tana=L1/(H-H1);
			double a=Math.atan(tana);//¥������
			
				for(int i=0;i<420;i+=5)
				{	int HH=9+i/60,MM=(i-(i/60)*60);
					
				if((arg2[i]<0&&(Math.abs(arg2[i]*Math.PI/180)>b1401))||
							(arg2[i]>0&&(Math.abs(arg2[i]*Math.PI/180)>a1401)&&
									(Math.abs(arg2[i]*Math.PI/180)<b1402))||
							(arg2[i]>0&&(Math.abs(arg2[i]*Math.PI/180)>a1402)))
					{//û�н����ڵ�ʱ�Ĺ���ʱ��
					//System.out.println("��"+HH+":"+MM+"ʱ�������⣬��¥��֮��");						
						time+=5;
					}
					else//��̫����λ���ڽ�����Χ��						
						
						{//̫���߶ȽǴ��ڸ�¥�������ǹ���ʱ��
						if(arg1[i]*Math.PI/180<a)
							{System.out.println("��"+HH+":"+MM+"ʱ��������!!!!!!!!!!!!");
							time+=5;
							}
						else 
						{//û�й��յ�ʱ���
							System.out.println("��"+HH+":"+MM+"ʱ�̹ⱻ�ڵ�*********");
						}							
				}
				}
										System.out.println("����"+time+"�����й�");	
				
	}		
	}

public class sun_shine {
	public static void main(String[] args){
		SunTime Fa=new SunTime();
		Fa.RFILE_1();
		Fa.RFILE_2();
		Fa.Light1();
	}
}
