package com.my;

public class Second {
	

	void hari()
	{
		byte b = 20;
	
		System.out.println(b);
	}
	
	byte b = 10;
	static int x = 30;
	
	public static void main(String[] args) {
	
	
		System.out.println("called");
		
		System.out.println(Second.x);
		Second se = new Second();
		se.hari();
		System.out.println(se.b);
	
	
	}

	}


