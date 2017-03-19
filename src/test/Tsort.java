package test;

import java.io.*; public class Tsort {  
	 public static void main(String args[ ]) { int[] a={42,99,5,63,95,36,2,69,200,96}; 
	System.out.println("排序前的数据序列:"); 
	ShowArray(a); Sort(a); 
	System.out.println("排序后的数据序列:"); 
	ShowArray(a); } 
	public static void Sort(int[] x) { int w; 
	for(int i=1; i<x.length; i++) { 
	  for(int j=0; j<x.length-1; j++)    
	 if(x[j]>x[j+1]) {   
	    w=x[j]; x[j]=x[j+1]; x[j+1]=w; 
	  if(i==1||i==2) ShowArray(x); if(i==2) break; 
	  }  }   }
	 public static void ShowArray(int b[]) { 
	for(int i=0; i<b.length; i++)  
	System.out.print("b[i"+i+"]=" +b[i]); 
	System.out.println( ); } } 
