/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Prime_not implements Runnable {
     public void run()
	    {
	        int n;
	        for(n=1;n<=1000;n++)
	        {
	            int sum=0;
	            for(int a=1;a<=n/2;a++)
	            {
	                if(n%a==0)
	                    sum=sum+a;
	            }
	            if(n==sum)
	                System.out.println(n+" Number is perfect or Not Prime");
	        try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	        
	    }
}
