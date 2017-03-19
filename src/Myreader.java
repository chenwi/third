import java.io.*;
public class Myreader{
   public static void main(String args[])throws IOException{
       FileReader fr1=new FileReader("C:\\Users\\Administrator\\Desktop\\my.txt");
       BufferedReader br1=new BufferedReader(fr1);      
       BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(System.out));
       int lineNum=0;
       String s=br1.readLine();
       System.out.println("输入文件是：c:\\dataFile.txt");
       while(s!=null){         lineNum++;
         bw1.write(String.valueOf(lineNum));
         bw1.write("    "); bw1.write(s);
         bw1.newLine();//  System.out.println(s);
         s=br1.readLine();
        }
       bw1.close();
   }
}
