import java.io.BufferedReader;
import java.io.FileReader;

class SunTime{
	double[] arg1=new double[500];
	double[] arg2=new double[500];
	public void RFILE_1(){
		try {
	        System.out.println(System.in);
	        FileReader fileReader1 = new FileReader("C:/高度角.txt");
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
	        FileReader fileReader1 = new FileReader("C:/方位角.txt");
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
		double x14=3784252.440,y14=517000.794;//14栋的坐标
		double x8=3784159.059,y8=516993.956;//8栋的坐标
		double a1401=Math.atan((y14-y8+16.2)/(4.3+74.78));//方位角
		double b1401=Math.atan((y14-y8-3.7)/(4.3+74.78));//方位角

		double x7=3784178.895,y7=516935.202;//7栋的坐标
		double a1402=Math.atan((y14-y7+16.2)/(4.3+54.13));//方位角
		double b1402=Math.atan((y14-y7-3.7)/(4.3+54.13));//方位角
		
			int time=0;
			double L1=74.78,H=98.6;
			//楼层高度设置
			double H1=8*2.9;
			
			double tana=L1/(H-H1);
			double a=Math.atan(tana);//楼层仰角
			
				for(int i=0;i<420;i+=5)
				{	int HH=9+i/60,MM=(i-(i/60)*60);
					
				if((arg2[i]<0&&(Math.abs(arg2[i]*Math.PI/180)>b1401))||
							(arg2[i]>0&&(Math.abs(arg2[i]*Math.PI/180)>a1401)&&
									(Math.abs(arg2[i]*Math.PI/180)<b1402))||
							(arg2[i]>0&&(Math.abs(arg2[i]*Math.PI/180)>a1402)))
					{//没有建筑遮挡时的光照时间
					//System.out.println("在"+HH+":"+MM+"时刻有阳光，在楼层之间");						
						time+=5;
					}
					else//当太阳方位角在建筑范围内						
						
						{//太阳高度角大于该楼层仰角是光照时间
						if(arg1[i]*Math.PI/180<a)
							{System.out.println("在"+HH+":"+MM+"时刻有阳光!!!!!!!!!!!!");
							time+=5;
							}
						else 
						{//没有光照的时间段
							System.out.println("在"+HH+":"+MM+"时刻光被遮挡*********");
						}							
				}
				}
										System.out.println("共有"+time+"分钟有光");	
				
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
