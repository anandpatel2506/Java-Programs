import java.util.*;
import java.lang.String;
/*
 * Author: Anand Patel
 * AM.EN.U4CSE19206
 * Date: 17/09/2020
 */
public class Weight_Q1_String {

	public static void main(String[] args) {

		 Scanner myObj=new Scanner(System.in);   //creating scanner object
         String s1=myObj.next();
         int i,j;
         int s=myObj.nextInt();
         int a[]=new int[s1.length()];
         int b[]=new int[s]; 
         Set<Character> check = new HashSet <Character>();
         
         for( i=0;i<s1.length();i++)
       	  {
       	     check.add(s1.charAt(i));
       	  }
  
         for(char tmp : check)
         {
       	  s=0;
       	  for(i=0;i<s1.length();i++)
       	  {
       		  if(tmp==s1.charAt(i))
       		  {
       			  s=s+(tmp%96);
       			  a[i]=s;
       		  }
       	  }
         }
         
         
         for(i=0;i<b.length;i++)
         {
              b[i]=myObj.nextInt();
         }
         
         
         s=0;
         for(i=0;i<b.length;i++)
           {
       	     s=0;
       	     for(j=0;j<a.length;j++)
       	    	{
       	    	  if(b[i]==a[j])
       	    	  {
       	    		System.out.println("YES");
       	    		s=1;
       	    		break;
       	    	   }
       	    	  
       	    	}
       	    if(s!=1)
       	      System.out.println("NO");
           }              
         
                
	}

}
