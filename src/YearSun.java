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
	        FileReader fileReader1 = new FileReader("C:/高度角1.txt");
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
	        FileReader fileReader1 = new FileReader("C:/方位角1.txt");
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
		double x14=3784252.440,y14=517000.794;//14栋的坐标
		double x8=3784159.059,y8=516993.956;//8栋的坐标
		double a1401=Math.atan((y14-y8+16.2)/(4.3+74.78));//方位角
		double b1401=Math.atan((y14-y8-3.7)/(4.3+74.78));//方位角

		double x7=3784178.895,y7=516935.202;//7栋的坐标
		double a1402=Math.atan((y14-y7+16.2)/(4.3+54.13));//方位角
		double b1402=Math.atan((y14-y7-3.7)/(4.3+54.13));//方位角
					
			double L1=74.78,H=98.6;
			
			//楼层高度设置
			double H1=8*2.9;			
			double tana=L1/(H-H1);int co=0;
			double a=Math.atan(tana);//楼层仰角
			for(int z=0;z<365;z++){
				int time=0;	
				
				for(int i=0;i<420;i+=5)
				{	int HH=9+i/60,MM=(i-(i/60)*60);
					
				if((DArr2[z][i]<0&&(Math.abs(DArr2[z][i]*Math.PI/180)>b1401))||
							(DArr2[z][i]>0&&(Math.abs(DArr2[z][i]*Math.PI/180)>a1401)&&
									(Math.abs(DArr2[z][i]*Math.PI/180)<b1402))||
							(DArr2[z][i]>0&&(Math.abs(DArr2[z][i]*Math.PI/180)>a1402)))
					{//没有建筑遮挡时的光照时间					//System.out.println("在"+HH+":"+MM+"时刻有阳光，在楼层之间");						
						time+=5;
					}
					else//当太阳方位角在建筑范围内						
						if(DArr1[z][i]*Math.PI/180<a)
						{//太阳高度角大于该楼层仰角是光照时间							
							time+=5;
						}
						else 
						{//没有光照的时间段//System.out.println("在"+HH+":"+MM+"时刻光被遮挡*********");
						}							
				}			
				if(time>360){
					co++;
					System.out.println("第"+z+"天"+"共有"+time+"分钟有光");
				}						
				
			}
			System.out.println("共有"+co+"天有光");	
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
