import java.util.*;
import java.lang.String;
/*
 * Author: Anand Patel
 * AM.EN.U4CSE19206
 * Date: 17/09/2020
 */
public class Funny_Q2_String {

	public static void main(String[] args) {
		 Scanner myObj=new Scanner(System.in);   //creating scanner object
         String s1=myObj.next();
		int s=0;
		int i,j;		
		int a[]=new int[s1.length()];
		for(i=0;i<s1.length();i++)
			a[i]=s1.charAt(i);
	
		
		
		int b[]=new int[s1.length()];
		for(i=0,j=a.length -1  ;i<a.length && j>=0;i++,j--)
			b[i]=a[j];
		     
				
		   for(i=0;i<a.length-1;i++)
		{
			a[i]=Math.abs(a[i]-a[i+1]);	
			b[i]=Math.abs(b[i]-b[i+1]);
		}
		
		
					
		for(i=0;i<a.length-1;i++)
		{
			if(a[i] !=b[i])
			{
				s=1;
				break;
			}	
	}
			
		
		
		
		if(s!=0)
			System.out.println("Not Funny");
		else System.out.println("It's Funny");

	}

}
