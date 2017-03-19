package test;

class myThread implements Runnable{ 
    String s;
    int m,count=0;
    myThread(String ss,int mm){
        s=ss;   m=mm;   }  
    public void run(){
        try {
           while (true){
              System.out.println(s
                               //+this.getName()
                                 + " - " + count);
              Thread.sleep(m);
              count++;
              if(count>=10) break;}
           System.out.println(s+" has finished ! "); 
        }
        catch(InterruptedException e)
          {return;}
}  }
public class MainClass{
    public static void main(String args[]){
        myThread  threadA=new myThread ("A",500); 
        myThread  threadB=new myThread ("B",1000); 
        Thread threadC=new Thread(threadA); 
        Thread threadD=new Thread(threadB); 
        threadC.start();
        threadD.start();
 }   }

