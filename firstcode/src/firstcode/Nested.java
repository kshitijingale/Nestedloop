package firstcode;

public class Nested {
	static public void main(String[] args)
	{
		int i,j;
	    
		for (j=1;j<=4;j++)
		{
		  for(i=1;i<=4;i++)
		   { 
			  if((j==2&&i==2)||(j==2&&i==3)||(j==3&&i==2)||(j==3&&i==3))
			  {
				  System.out.print("   ");
				  
			  }
			  else
			  {
			     System.out.print(" $ ");
			  }
		   }
		  System.out.println();
		} 
	}

}
