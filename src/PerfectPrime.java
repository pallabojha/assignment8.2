/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PerfectPrime {
    public static void main(String args[])
	    {
	        try
	        {
	            Prime_not p=new Prime_not();
	            Thread t1=new Thread(p);
	            Prime p1=new Prime();
	            Thread t2=new Thread(p1);
	            t1.start();
	            t2.start();
	        }
	        catch(Exception e1){}
	    }  
}
