/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Prime implements Runnable {
	
      public void run()
	    {
	        int n;
	        for(n=2;n<=1000;n++)
	        {
	            int c=0;
	            for(int a=2;a<=n/2;a++)
	                if(n%a==0)
	                {
	                    c++;
	                    break;
	                }
	            if(c==0)
	                System.out.println(n+" Number is prime");
	        try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	    }
}
