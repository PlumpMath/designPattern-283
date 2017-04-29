package com.jd.dp.state;

public class YellowState implements State{

	 private static final Long SLEEP_TIME = 2000L;  
	   
	 public void change(Light light) {  
	          
		 System.out.println("现在是黄灯，警示");  
	        //红灯亮0.5秒  
	        try {  
	            Thread.sleep(SLEEP_TIME);  
	        } catch (InterruptedException e) {  
	            // TODO Auto-generated catch block  
	            e.printStackTrace();  
	        }  
	        light.setState(new RedState());  
	    }  
}
