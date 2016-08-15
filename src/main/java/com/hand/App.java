package com.hand;



public class App 
{
    public static void main( String[] args )
    {
    	for(int i=100,j;i<=200;i++){
			  int k=(int) Math.sqrt(i);
			  for(j=2;j<=k;j++){
			      if(i%j==0){
			    	  
			   break;
			      }
			  }
			  if(j>k){
			      System.out.println(i);
			  }
	 if(j>k){
			      System.out.println(i);
			  }
    	}
   }
}